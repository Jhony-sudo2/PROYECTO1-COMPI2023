/*Java Code Specification*/
package com.mycompany.server.parser;
import static com.mycompany.server.parser.ParserSym.*;
import java_cup.runtime.Symbol;
%%
%class LexerXml
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




%eofval{
    return token(EOF);
%eofval}
%eofclose

/*Actions*/
%%

(world)                 {return token(WORLD);}
(name)                 {return token(NAME);}
{Id}                    {return token(ID);}
"<"                     {return token(LTHAN);}
">"                     {return token(GTHAN);}
"/"                     {return token(SLASH);}
[^]			{ }











 
