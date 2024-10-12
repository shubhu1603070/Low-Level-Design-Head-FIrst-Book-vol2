package org.shubhamLearning.Control;

import org.shubhamLearning.Command.Command;
import org.shubhamLearning.Command.Impl.NoCommand;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//This is client
public class RemoteControl {

    Command[] onCommand;
    Command[] offCommand;

    List<Command> unDoCommand;

    public RemoteControl(int slots){
        onCommand = new Command[slots];
        offCommand = new Command[slots];
        Command noCommand = new NoCommand();
        unDoCommand = new ArrayList<>();
        for (int i = 0; i < slots; i++) {
            onCommand[i] = noCommand;
            offCommand[i] = noCommand;
        }
    }


    public void setCommand(int slot,Command onCommand,Command offCommand){
        this.onCommand[slot] = onCommand;
        this.offCommand[slot] = offCommand;
    }

    public Command getOnCommand(int slot){
        return this.onCommand[slot];
    }

    public Command getOffCommand(int slot){
        return this.offCommand[slot];
    }

    public void onCommandPushed(int slot){
        this.getOnCommand(slot).execute();
        unDoCommand.add(this.getOnCommand(slot));
    }

    public void offCommandPushed(int slot){
        this.getOffCommand(slot).execute();
        unDoCommand.add(this.getOnCommand(slot)); //We're doing this to get the previous command which was executed
    }

    public void undoCommandPushed(int slot) {
        for(Command command : unDoCommand){
            System.out.println("Commands present in unDoRightNow"+command.getClass().getName());
        }
        Command commandAtSlot = unDoCommand.remove(slot);
        unDoCommand.add(commandAtSlot);
        commandAtSlot.execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommand=" + Arrays.toString(onCommand) +
                ", offCommand=" + Arrays.toString(offCommand) +
                '}';
    }
}
