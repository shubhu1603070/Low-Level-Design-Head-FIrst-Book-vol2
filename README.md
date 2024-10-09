*************************************************************************************************************************************************************
  
                                                              Observer Pattern START

*************************************************************************************************************************************************************

What is Observer Pattern

Ans:
It's like pub-sub model
It's like publisher/subject and subscriber/observer
What i mean by this is that as soon as we publish something all the subscriber who have subscribed to the publisher will be notified and will change their own state means as soon as
any change happen on the publisher subscriber also does change the state acc. to the publisher

IMP:
"Best Example" : We all get notification in our cell phones from different sources so consider this sources as subject/publisher
               and mobile/tab/laptop as observer/subscriber

 IMP:
"When To use this Pattern" : When we want to change the current state of the system as soon as the data-source state changes.


Example:

Suppose if there are more than 3 subjects
AajTakNewsChannel -> They'll publish the news
BharatNewsChannel -> They'll also publish the news
ZeeNewsChannel  -> They'll also publish the news

I have 3 users
MobileUser
LaptopUser
TabUser

Case 1:
Now let's say MobileUser have taken the subscription from 2 channels
AajTakNewsChannel and BharatNewsChannel

Case 2:
Now let's say LaptopUser have taken the subscription from 2 channels
AajTakNewsChannel and BharatNewsChannel

Case 3:
Now let's say TabUser have taken the subscription from 1 channels
ZeeNews

Case 1:
When the AajTakNewsChannel / BharatNewsChannel publishes anything means the state have changed for the Subject/Publisher
MobileUser will change it's state by consuming the data produced by Publisher

Case 2:
When the AajTakNewsChannel / BharatNewsChannel publishes anything means the state have changed for the Subject/Publisher
LaptopUser will change it's state by consuming the data produced by Publisher

Case 2:
When the ZeeNewsChannel publishes anything means the state have changed for the Subject/Publisher
Tab will change it's state by consuming the data produced by Publisher

Now let's say if Laptop User unsubscribe the subscription from AajTakNewsChannel after removal AajTakNewsChannel publishes some news on their channel will LaptopUser will still change it's state
Answer is "NO" Why? Bcuz we don't have subscription now and LaptopUser doesn't care if the AajTakNewsChannel is still changing it's state or not.

KeyPoints:
1) We can have more than one Publisher/Subject for that we create 1 interface in Subject
    1.1) Now Multiple Subject can implement it and reuse the code

    # Operations in Publisher/Subject
        1) Subject have to subscribe/add the subscriber/observer
        2) Subject may have to cancel/remove the subscription/observer
        3) Subject will have to Notify Observer/Subscriber when it's state changes
        4) Subject will update it's state using set method
        5) Subject will get the current state using get method

2) We can have more than one Subscriber/Observer also for that we create 1 interface in Observer
    2.1) Now multiple subscriber will implement the Subscriber/Observer

    # Operation in Subscriber/Observer
        1) Update the current state -> But for this we also have to understand from which publisher the change have come from and will call methods to the get the
            current state of that particular publisher Point number 5 of 1 -> # Operation

Case 1 : A Single subscriber/observer can subscribe/observe more than one Publisher/Subject

Case : What if i don't want more state change from a subject?
    Ans : I simply remove the subscription

*************************************************************************************************************************************************************
  
                                                              Observer Pattern END

*************************************************************************************************************************************************************


*************************************************************************************************************************************************************
  
                                                              Decorator Pattern START

*************************************************************************************************************************************************************


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

*************************************************************************************************************************************************************
  
                                                              Decorator Pattern END

*************************************************************************************************************************************************************

                          -----------------------------
                            "DECORATOR DESIGN PATTERN"
                          -----------------------------
