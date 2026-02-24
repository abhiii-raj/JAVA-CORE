<!-- it gives any control flow choices -->

expression -> the value which are evaluated having value as true or false

if there is a single expression in if then you can avoid curly braces.., but when multiple lines in the scope mandate to keep the braces.
good practise will be laga ke chalo

you can go to any level of nesting, good practise to go upto 3-4 level

if else if ladder is used when you ahve mulitple condition to check

switch has limited use case
expression -> int, byte, short, char, enumeration string

java compiler form a jump table based on that it will have a random access for every expression if it matches in the case value

jump table hamesha nahi banta har baar nahi banta, it depends on the compiler usko jump table banana hai ya nahi banana
jump tables are not always efficient
only efficient when the expression are dense
java ka compliler jump tables tabhi banayega tab woh switch ko efficient kar paaye

switch case -> constant time
if-else-if -> liner time

jump tables are like array where on each index all the logics for the value of the cases get stored , when such expression macthes any index then that particular value get executed..

switch(expression){
    case 1:
    case 1000:
    case 1000000:
}

jump tables are not formed also form a method for efficiency 

jump switch
table switch -> will form a table and at the index all the logics of case get stored
lookup switch ->         