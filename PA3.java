/* Generated By:JavaCC: Do not edit this line. PA3.java */
public class PA3 implements PA3Constants {
    public static void main(String[] args) throws ParseException {
        PA3 parser = new PA3(System.in);
        parser.Program();
        System.out.println("Parse success!");
    }

  static final public void Program() throws ParseException {
    MainClass();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      ClassDeclaration();
    }
    jj_consume_token(0);
  }

  static final public void MainClass() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
        System.out.println("class " + token.image + " {");
    jj_consume_token(LBRACE);
    jj_consume_token(PUBLIC);
    jj_consume_token(STATIC);
    jj_consume_token(VOID);
    jj_consume_token(MAIN);
    jj_consume_token(LPAREN);
    jj_consume_token(STRING);
    jj_consume_token(LBRACKET);
    jj_consume_token(RBRACKET);
    jj_consume_token(IDENTIFIER);
        System.out.println("    public static void main(String[] " + token.image + ") {");
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
      case STRING:
      case INT:
      case BOOLEAN:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
      VarDeclaration();
    }
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case PRINTLN:
      case PRINT:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      Statement();
    }
    jj_consume_token(RBRACE);
        System.out.println("    }");
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PUBLIC:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_4;
      }
      MethodDeclaration();
    }
    jj_consume_token(RBRACE);
        System.out.println("}");
  }

  static final public void ClassDeclaration() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(IDENTIFIER);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case EXTENDS:
      jj_consume_token(EXTENDS);
      jj_consume_token(IDENTIFIER);
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    jj_consume_token(LBRACE);
        System.out.println("class " + token.image + " {");
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
      case STRING:
      case INT:
      case BOOLEAN:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_5;
      }
      VarDeclaration();
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PUBLIC:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_6;
      }
      MethodDeclaration();
    }
    jj_consume_token(RBRACE);
        System.out.println("}");
  }

  static final public void VarDeclaration() throws ParseException {
    Type();
    jj_consume_token(IDENTIFIER);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ASSIGN:
      jj_consume_token(ASSIGN);
      Expression();
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    jj_consume_token(SEMICOLON);
        System.out.println("    " + token.image + ";");
  }

  static final public void MethodDeclaration() throws ParseException {
    jj_consume_token(PUBLIC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STATIC:
      jj_consume_token(STATIC);
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    Type();
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case VOID:
    case STRING:
    case INT:
    case BOOLEAN:
      Type();
      jj_consume_token(IDENTIFIER);
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[9] = jj_gen;
          break label_7;
        }
        jj_consume_token(COMMA);
        Type();
        jj_consume_token(IDENTIFIER);
      }
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
        System.out.println("    public " + token.image + "(" + token.next.image + ") {");
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VOID:
      case STRING:
      case INT:
      case BOOLEAN:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_8;
      }
      VarDeclaration();
    }
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case PRINTLN:
      case PRINT:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[12] = jj_gen;
        break label_9;
      }
      Statement();
    }
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case RETURN:
      jj_consume_token(RETURN);
      Expression();
      jj_consume_token(SEMICOLON);
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    jj_consume_token(RBRACE);
        System.out.println("    }");
  }

  static final public void Type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case STRING:
      jj_consume_token(STRING);
      break;
    case VOID:
      jj_consume_token(VOID);
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void IfStatement() throws ParseException {
    jj_consume_token(IF);
    jj_consume_token(LPAREN);
    Expression();
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case PRINTLN:
      case PRINT:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_10;
      }
      Statement();
    }
    jj_consume_token(RBRACE);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ELSE:
      jj_consume_token(ELSE);
      jj_consume_token(LBRACE);
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case WHILE:
        case PRINTLN:
        case PRINT:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[16] = jj_gen;
          break label_11;
        }
        Statement();
      }
      jj_consume_token(RBRACE);
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
  }

  static final public void WhileStatement() throws ParseException {
    jj_consume_token(WHILE);
    jj_consume_token(LPAREN);
    Expression();
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case PRINTLN:
      case PRINT:
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_12;
      }
      Statement();
    }
    jj_consume_token(RBRACE);
  }

  static final public void PrintStatement() throws ParseException {
    jj_consume_token(PRINT);
    jj_consume_token(LPAREN);
    Expression();
    jj_consume_token(RPAREN);
    jj_consume_token(SEMICOLON);
  }

  static final public void PrintlnStatement() throws ParseException {
  String result;
    jj_consume_token(PRINTLN);
    jj_consume_token(LPAREN);
    result = Expression();
    jj_consume_token(RPAREN);
    jj_consume_token(SEMICOLON);
        System.out.println("    System.out.println(" + result + ");");
  }

  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      jj_consume_token(IDENTIFIER);
      jj_consume_token(ASSIGN);
      Expression();
      jj_consume_token(SEMICOLON);
      break;
    case IF:
      IfStatement();
      break;
    case WHILE:
      WhileStatement();
      break;
    case PRINTLN:
      PrintlnStatement();
      break;
    case PRINT:
      PrintStatement();
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public String Expression() throws ParseException {
 String result;
    if (jj_2_1(2)) {
      result = jj_consume_token(IDENTIFIER);
      jj_consume_token(ASSIGN);
      Expression();
      jj_consume_token(SEMICOLON);
                                                                           {if (true) return result;}
    } else if (jj_2_2(2)) {
      result = jj_consume_token(IDENTIFIER);
      jj_consume_token(DOT);
      MethodCall();
                                                            {if (true) return result;}
    } else if (jj_2_3(2)) {
      result = jj_consume_token(LPAREN);
      ObjectInstantiation();
      jj_consume_token(RPAREN);
      jj_consume_token(DOT);
      MethodCall();
                                                                                        {if (true) return result;}
    } else {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NEW:
        result = ObjectInstantiation();
                                     {if (true) return result;}
        break;
      case LPAREN:
        result = jj_consume_token(LPAREN);
        Expression();
        jj_consume_token(RPAREN);
                                              {if (true) return result;}
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    throw new Error("Missing return statement in function");
  }

  static final public void ObjectInstantiation() throws ParseException {
    jj_consume_token(NEW);
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    jj_consume_token(RPAREN);
  }

  static final public void MethodCall() throws ParseException {
    if (jj_2_4(2)) {
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INTEGER_LITERAL:
        jj_consume_token(INTEGER_LITERAL);
        label_13:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            ;
            break;
          default:
            jj_la1[21] = jj_gen;
            break label_13;
          }
          jj_consume_token(COMMA);
          jj_consume_token(INTEGER_LITERAL);
        }
        break;
      default:
        jj_la1[22] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } else if (jj_2_5(2)) {
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      jj_consume_token(DOT);
      jj_consume_token(IDENTIFIER);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NEW:
      case IDENTIFIER:
      case LPAREN:
        Expression();
        label_14:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            ;
            break;
          default:
            jj_la1[23] = jj_gen;
            break label_14;
          }
          jj_consume_token(COMMA);
          Expression();
        }
        break;
      default:
        jj_la1[24] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
    } else {
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_3_5() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_scan_token(NEW)) return true;
    return false;
  }

  static private boolean jj_3R_18() {
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    if (jj_3R_15()) return true;
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_scan_token(LPAREN)) return true;
    if (jj_3R_15()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(DOT)) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_scan_token(IDENTIFIER)) return true;
    if (jj_scan_token(ASSIGN)) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3_1()) {
    jj_scanpos = xsp;
    if (jj_3_2()) {
    jj_scanpos = xsp;
    if (jj_3_3()) {
    jj_scanpos = xsp;
    if (jj_3R_17()) {
    jj_scanpos = xsp;
    if (jj_3R_18()) return true;
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public PA3TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  /** Whether we are looking ahead. */
  static private boolean jj_lookingAhead = false;
  static private boolean jj_semLA;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[25];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x40,0x18a00,0x7a0000,0x80,0x1000,0x18a00,0x80,0x0,0x100,0x1000000,0x18a00,0x18a00,0x7a0000,0x2000,0x18a00,0x7a0000,0x7a0000,0x40000,0x7a0000,0x7a0000,0x4004000,0x1000000,0x20,0x1000000,0x4404000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x1,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[5];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public PA3(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PA3(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PA3TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public PA3(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new PA3TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public PA3(PA3TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(PA3TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 25; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = jj_lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List jj_expentries = new java.util.ArrayList();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[43];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 25; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 43; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 5; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
