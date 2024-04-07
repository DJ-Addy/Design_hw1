## Explaination:

Video Game Problem:
"You are a video game designer working on an online multiplayer game. You want to implement a system where you can keep track of the attributes of each player and quickly increase player stats as they level up. The players will each have a unique username and each player will have a variety of stats that each have their own value. You want to be able to quickly switch between players, and access their stats to increase them when they unlock new achievements and levels."

The Videogame_players.java is where we handle each players, and quickly access stat names using a key value pair:
username: store the username
Stats<statname,int>: store all of the player attributes, key:statname, value:

Videogame_players(username):
initializes a new player with username and a hashmap

getUsername(): gets a Username 
setUsername(String username): sets a players username, one problem is that any name is valid 
setStat(String statName, int value): takes stat name and value and adds to map 
getStat(String statName): returns stat or return default=0 
increaseStat(String statName, int amount): takes stat name and increments that statvalue by the amount 

PlayerTest cases:  
setUp() method is annotated with @Before to set up a new instance of Videogame_players before each test method is executed.
testGetUsername() method verifies that the getUsername() method returns the correct username for the player.
testSetAndGetStat() method sets a statistic using setStat and verifies that getStat returns the expected value.
testGetStatWithNonExistingStatName() method tests the behavior of getStat when querying a non-existing statistic name, expecting it to return 0.
testIncreaseStat() method tests the increaseStat method by setting a statistic, then increasing it and verifying that the new value is as expected.

assumption:
-interger based stats, inspiration from rpgs
-key,value pairs instead of a database for storage
-ingame storage of stats, No Authentication

questions for clients: 
-How do you envision the player's statistics being used in your game? Will they affect gameplay directly (e.g., health affecting combat performance), or will they be used for progression and achievement tracking?

-Do you anticipate the need to persist player data across sessions or across different instances of the game? If so, how do you plan to handle data storage and retrieval?

-Will player statistics be visible to other players within the game, or are they intended for internal use only?




International travelers
Many international travelers arrive at JFK International Airport each day. They can be foreigners or US citizens. In order to go through customs and enter the US, there are certain qualities that they need to attain. For example, foreigners must have a valid US Visa and have either clean background or have committed a minor crime that has already been explained. Both US citizens and foreigners need to not be bringing unknown substances or things that are prohibited into the country. If any of these qualities aren’t met, the particular visitor won’t be able to enter the US. Design a system for the authorities to use to store information on travelers and to quickly look them up upon arrival.

international_traveler:

Attributes:
name: Represents the name of the traveler.
passportNumber: Represents the passport number of the traveler.
isUSCitizen: Indicates whether the traveler is a US citizen (true) or a foreigner (false).
hasValidVisa: Indicates whether the traveler has a valid US visa (true) or not (false).
hasCleanBackground: Indicates whether the traveler has a clean background (true) or not (false).
hasExplanationForMinorCrime: Indicates whether the traveler has provided an explanation for a minor crime, if any (true) or not (false).
isBringingProhibitedItems: Indicates whether the traveler is bringing prohibited items into the country (true) or not (false).

Getters (getName(), getPassportNumber(), isUSCitizen(), hasValidVisa(), hasCleanBackground(), hasExplanationForMinorCrime(), isBringingProhibitedItems()): These methods allow access to the values of the attributes.

Setters (setName(), setPassportNumber(), setUSCitizen(), setValidVisa(), setCleanBackground(), setExplanationForMinorCrime(), setBringingProhibitedItems()): These methods allow modification of the values of the attributes.



Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
