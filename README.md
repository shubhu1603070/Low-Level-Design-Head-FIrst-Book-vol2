What exactly is Decorator Pattern?

Ans : Decorator Pattern is used to wrap a object over a object what i mean by this is that we Wrap a object inside the another object and @ the end we get the chain of objects calling it's super method that way we get our desired output

Example:

A) Car Owners

1) A User want to buy CAR with car they want mirror also
2) B User want to buy CAR with different kind of tyre
3) C User want to buy CAR with different kind of Exhaust/Silencer

B) Bike Owners

1) D User want to buy BIKE with different kind of Mirror
2) E User want to buy BIKE with different kind of tyre

So let's say we have one base class

                                                               Vehicle
                                                                  |
                                                                  |
                                                                  |
                                      ------------------------------------------------------
                                      |                                                     |
                                     CAR                                                   BIKE
                                      |                                                     |
                                      |                                                     |
       -----------------------------------------------                            -------------------------
      |                      |                       |                            |                        |
    MIRROR                  TYRE                  SILENCER                      MIRROR                    TYRE



Now let's say what if i want a CAR with this Specifications:
  Base Model
  Base Model + Mirror + Tyre 
  Base Model + Tyre + Silencer
  Base Model + Tyre
  Base Model + Silencer + Mirror
  Base Model + Silencer + Mirror + Tyre

CAN You see the permutations and combinations think about how many classes we'll need to fullfill this permutation and combination this is called => "CLASSES EXPLOSION"

To Overcome the Issue of "CLASSES EXPLOSION" => We use Decorator Pattern



-------------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                        What if i buy the base car version
                                                        Add new tyre as a feature
                                                        Add new Silencer as a feature
                                                        Add new Mirror as a feature
-------------------------------------------------------------------------------------------------------------------------------------------------------------------


    Base Model + Mirror + Tyre :

        What i can do is create a car object give this car object
          Give this car object to Tyre Class Object
            Give this Tyre Class Object to Mirror Class

      Mirror class will call the object of tyre class
      tyre class will call the object of the car class

      We get results from all the 3 classes and then return back the result

--------------------------------------------------------------------------------------

      Base Model + Mirror + Silencer:

        What i can do is create a car object give this car object
          Give this car object to Tyre Class Object
            Give this Silencer Class Object to Mirror Class

      Silencer class will call the object of tyre class
      tyre class will call the object of the car class

      We get results from all the 3 classes and then return back the result

What we see here is calling chain of objects from one object to another object which is nothing but wrapping of object in one another => This is nothing but 

                          -----------------------------
                            "DECORATOR DESIGN PATTERN"
                          -----------------------------
