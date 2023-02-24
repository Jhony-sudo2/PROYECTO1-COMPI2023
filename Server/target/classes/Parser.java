
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615
//----------------------------------------------------

package com.mycompany.server.parser;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserSym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\006\003\000\002\002\004\000\002\002" +
    "\005\000\002\002\005\000\002\002\003\000\002\003\005" +
    "\000\002\003\005\000\002\003\003\000\002\004\005\000" +
    "\002\004\003\000\002\005\006\000\002\005\006\000\002" +
    "\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\014\010\007\032\006\033\015\050\004\051" +
    "\005\001\002\000\016\002\ufff5\004\ufff5\005\ufff5\006\ufff5" +
    "\007\ufff5\011\ufff5\001\002\000\016\002\ufff4\004\ufff4\005" +
    "\ufff4\006\ufff4\007\ufff4\011\ufff4\001\002\000\004\010\034" +
    "\001\002\000\014\010\007\032\006\033\015\050\004\051" +
    "\005\001\002\000\004\002\031\001\002\000\016\002\ufff8" +
    "\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8\001\002\000" +
    "\016\002\ufffa\004\ufffa\005\ufffa\006\ufffa\007\ufffa\011\ufffa" +
    "\001\002\000\016\002\ufffd\004\ufffd\005\ufffd\006\024\007" +
    "\025\011\ufffd\001\002\000\010\002\001\004\020\005\021" +
    "\001\002\000\004\010\016\001\002\000\014\010\007\032" +
    "\006\033\015\050\004\051\005\001\002\000\010\004\020" +
    "\005\021\011\022\001\002\000\014\010\007\032\006\033" +
    "\015\050\004\051\005\001\002\000\014\010\007\032\006" +
    "\033\015\050\004\051\005\001\002\000\016\002\ufff6\004" +
    "\ufff6\005\ufff6\006\ufff6\007\ufff6\011\ufff6\001\002\000\016" +
    "\002\ufffe\004\ufffe\005\ufffe\006\024\007\025\011\ufffe\001" +
    "\002\000\014\010\007\032\006\033\015\050\004\051\005" +
    "\001\002\000\014\010\007\032\006\033\015\050\004\051" +
    "\005\001\002\000\016\002\ufffb\004\ufffb\005\ufffb\006\ufffb" +
    "\007\ufffb\011\ufffb\001\002\000\016\002\ufffc\004\ufffc\005" +
    "\ufffc\006\ufffc\007\ufffc\011\ufffc\001\002\000\016\002\uffff" +
    "\004\uffff\005\uffff\006\024\007\025\011\uffff\001\002\000" +
    "\004\002\000\001\002\000\010\004\020\005\021\011\033" +
    "\001\002\000\016\002\ufff9\004\ufff9\005\ufff9\006\ufff9\007" +
    "\ufff9\011\ufff9\001\002\000\014\010\007\032\006\033\015" +
    "\050\004\051\005\001\002\000\010\004\020\005\021\011" +
    "\036\001\002\000\016\002\ufff7\004\ufff7\005\ufff7\006\ufff7" +
    "\007\ufff7\011\ufff7\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\034\000\014\002\013\003\012\004\011\005\010\006" +
    "\007\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\012\002\031\003\012\004\011\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\002\016\003\012\004\011\005\010\001\001\000\002" +
    "\001\001\000\010\003\027\004\011\005\010\001\001\000" +
    "\010\003\022\004\011\005\010\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\026\005\010\001\001\000" +
    "\006\004\025\005\010\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\012\002\034\003\012\004\011" +
    "\005\010\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    public Parser(Lexer lexer){
        super(lexer);
    }



/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Operation ::= a 
            {
              Double RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double e = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		System.out.println("LA OPERACION ES " + e);
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Operation",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Operation EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double start_val = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // a ::= a PLUS b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1+n2;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // a ::= a MINUS b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1-n2;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // a ::= b 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("a",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // b ::= b MULT c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1 * n2;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // b ::= b DIV c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n2 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1 / n2;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // b ::= c 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("b",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // c ::= Parenth_O a Parenth_C 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = n1;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // c ::= d 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n1;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("c",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // d ::= FLOOR Parenth_O a Parenth_C 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = Math.floor(n1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // d ::= CEIL Parenth_O a Parenth_C 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Double n1 = (Double)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = Math.ceil(n1); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // d ::= INT 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = Double.valueOf(n1.getValue());
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // d ::= DECIMAL 
            {
              Double RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Token n1 = (Token)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = Double.valueOf(n1.getValue());
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("d",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
