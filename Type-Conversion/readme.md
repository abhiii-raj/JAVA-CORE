# Typecasting
It is a process by which we convert a datatype into an another datatype

# Types Of Typecasting
## Implicit Typecasting
If the process of typecasting is done automatically by the compiler then considered as the impicit one.
It is also known as widening conversion, because the destination data type is having bigger range as compared to source datatype.

        example
        byte b = 44;
        The byte datatype has range of (-128 - 127) (2^8-1);
        Total bit needed to represent a byte value will be 8;

        if we want to convert this b into datatype having a higher range
        let's say it as int,
        then int has range of 32bit , means byte datatype can be easily accomadated
        into int.

## Explicit Typecasting
It uses a casting approach.
The process of typecasting in which we have to explicitly tell the compiler that we have to convert into a datatype having a lower range to not to get any error, because the conversion of lower to higer is allowed but vice-versa is not allowed

We have to specify in which dataype we are going to convert;

        int a = 300;
        byte b = a; // wrong
        byte b = (int) a;

        a = 300 but since the the range of b is less then value stored at memory address b will be 44; \
        it will take only 8 bits of 300(in binary)
        
        (300)2 = 00000000 00000000 00000001 00101100
                    8        8        8         8
        so the last 8 bits is considered -> 
        0    0      1     0    1    1    0    0
       128   64    32    16    8    4    2    1

            32 + 8 + 4 = 44

This way of typecasting is also known as Narrowing Conversion.

## Truncating Conversion
The process of truncating comes in the picture when we want to convert a float or a double datatype into int dataype.

        float        double
          |            |
          --------------
                |
               Int


        float b = 16.25f;
        int i = b; //The compiler will not allow to do this
        int i = (int)b  //The decimal part will be truncated(will be ignored or cut-off)


# Note
Conversion of boolean datatype into any datatype not possible in java
because boolean is a special data type 

# Type Promotion
Whenever we are dealing with some expression then this concept come into picture.

        byte b = 50;
        b = b * 2; // this will cause an error

        -first b is converted into int 
        -then mulitplied with 2
        -the result obtained will also be a int
        -storing it in a byte is not possible

## Rule for type promotion
1. byte, short and char values are promoted to int
2. if one operand is long , the whole expression will become long.
3. if one operand is float , entire expression will become float.
4. If one operand is double ,  entire expression is double.
