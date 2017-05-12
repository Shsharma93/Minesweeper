# Minesweeper
Command line based object oriented application that print out correct hints for a given minesweeper. 

INPUT : The program first accepts a line containing two integers n and m (where 0 < n,m < 100) which will stand for the number of lines and columns of the field respectively. The program will then read n lines, each containing m characters that represent the squares. Each safe square is to be represented by a period (.) character and each mined square is represented by a star (*) character.

OUTPUT : The output should contain the field with the safe squares listing the number of adjacent mines to that square.

Example

The Input:

3 5
**...
.....
.*...

will return Output :

**100
33200
1*100

