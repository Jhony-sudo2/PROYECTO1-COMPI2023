/*Java Code Specification*/
package com.mycompany.server.parser;
import static com.mycompany.server.parser.ParserSym.*;
import java_cup.runtime.Symbol;
%%
%class Lexer
%unicode
%line
%column
%type java_cup.runtime.Symbol
%cup

%{
    private Symbol token(int type,String Value){
        return new Symbol(type, new Token(Value,yyline+1,yycolumn+1,type));
    }

    private Symbol token(int Type){
        return new Symbol(Type,new Token(yyline+1,yycolumn+1,Type));
    }
%}

/*Regular expresions*/

Id 		= [:jletter:] [:jletterdigit:]*
Integer 	= 0 | [1-9][0-9]*
Decimal 	= {Integer}\.\d+
Hexa		= [0-9]|[a-f]
HexaDec 	= "#"{Hexa}{6}
LineTerminator = \r|\n|\r\n
WhiteSpace     = {LineTerminator} | [ \t\f]



%eofval{
    return token(EOF);
%eofval}
%eofclose

/*Actions*/
%%
(all)                   {return token(ALL);}
(world)                 {return token(WORLD);}
(worlds)		{return token(WORLDS);}
(name)			{return token(NAME);}
(rows)			{return token(ROW);}
(cols)			{return token(COLS);}
(config)		{return token(CONFIG);}
(box_color)		{return token(BCOLOR);}
(box_on_target_color)	{return token(BOTCOLOR);}
(target_color)		{return token(TCOLOR);}
(brick_color)		{return token(BRCOLOR);}
(hall_color)		{return token(HCOLOR);}
(undefined_color)	{return token(UCOLOR);}
(player_color)		{return token(PCOLOR);}
(board)			{return token(BOARD);}
(posX)			{return token(POSX);}
(posY)			{return token(POSY);}
(type)			{return token(TYPE);}
(boxes)			{return token(BOXES);}
(targets)               {return token(TARGETS);}
(player)		{return token(PLAYER);}
(FLOOR)			{return token(FLOOR);}
(CEIL)			{return token(CEIL);}
(BRICK)			{return token(BRICK);}
(HALL)			{return token(HALL);}

{HexaDec}		{return token(HEXA,yytext());}
{Id}			{return token(ID,yytext());}
{Integer}		{return token(INT,yytext());}
{Decimal}		{return token(DECIMAL,yytext());}
{WhiteSpace}            {/* ignore */}

/*Operators*/
"+"			{return token(PLUS);}
"-"			{return token(MINUS);}
"/"			{return token(DIV);}
"*"			{return token(MULT);}
":"			{return token(DPUNTOS);}
","			{return token(COMMA);}
"\""			{return token(COMILLAS);}
")"			{return token(Parenth_C);}	
"("			{return token(Parenth_O);}
"{"			{return token(Key_O);}
"}"			{return token(Key_C);}
"["			{return token(Cor_O);}
"]"			{return token(Cor_C);}
[^]			{System.out.println("ERROR    " + yytext());}











 
