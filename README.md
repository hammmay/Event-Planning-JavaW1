# Event Planning Price Calculator

#### By Laura Hamilton

## Description

This application is a demonstration of Java integers, strings, objects, classes, properties, methods, conditional behavior-driven programing, and JUnit testing. The application will prompt a user through the console to enter details about a event they are trying to get a quote for, and based on these inputs, the program will create and return a customized price quote and a summary of the event details the user entered.

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|A user enters the number of guests who are attending, chooses a drinks package, chooses a food package, and chooses an entertainment option, and all the inputs chosen are collected and are displayed back to the user|100, Tapas, Wine, Live Singer|100, Tapas, Wine, Live Singer|
|No entertainment option is selected by the user and, and the total quote is adjusted|None|$0|
|The DJ entertainment option is selected by the user and, and the total quote is adjusted|DJ|$250|
|The Live Singer entertainment option is selected by the user and, and the total quote is adjusted|Live Singer|$500|
|The juice drinks option is selected by the user and, and the total quote is adjusted based on the number of guests entered|100, Juice|$500|
|The wine drinks option is selected by the user and, and the total quote is adjusted based on the number of guests entered|100, Wine|$1000|
|The tapas food option is selected by the user and, and the total quote is adjusted based on the number of guests entered|100, Tapas|$500|
|The Dinner food option is selected by the user and, and the total quote is adjusted based on the number of guests entered|100, Dinner|$1500|
|A user enters the number of guests who are attending, chooses a drinks package, chooses a food package, and chooses an entertainment option, and the total quote is displayed back to the user|100, Tapas, Wine, Live Singer|$2000|
|A user is asked if they have a coupon, selects No, and the quote remains the same|No|$0|
|A user is asked if they have a coupon, enters the coupon code FREEDJ, and selected the Wine drinks option and DJ after inputting 100 or more people and the total quote drops by $250|100, Wine, DJ|$1000|
|A user is asked if they have a coupon, enters the coupon code FREESINGER, and selected the Dinner food option and Singer after inputting 200 or more people and the total quote drops by $500|200, Dinner, Singer|$3000|
|After a user is given a summary and a quote, the user is asked if they want to exit the program or if they would like to start over again and get a new quote|User presses enter after the coupon prompt|Quote and itemized list displays above this new prompt "What would you like to do? New Quote, or Exit"|
|User selects New Quote after final prompt|New Quote|Welcome line and first prompt appear|
|User selects Exit after final prompt|Exit|Program ends|

## Setup

Install by cloning this repository and operating in console.

## Technologies Used

Java
Gradle

### Legal

Copyright (c) 2017 Laura Hamilton laurahamilton9@gmail.com

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
