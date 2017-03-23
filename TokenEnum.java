package beans;

/**
 * Created by antonskripacev on 23.03.17.
 */
public enum TokenEnum {

    ID(""),

    /**
     * OPERATIONS
     * */
    PLUS("+"),MINUS("-"),ASSIGN("="),MULTIPLY("*"),DIVIDE("/"),
    AND("&"),OR("|"),DOT("."), COMMA(","),
    GREATER(">"),LESS("<"),NOT("!"), EQUAL("="),

    /**
     * SIGNS
     * */
    OPENBRACE("{"),CLOSEBRACE("}"),SEMICOLON(";"), COLON(":"),OPENPAREN("("),
    CLOSEPAREN(")"),OPENSQUARE("["),CLOSESQUARE("]"),

    /**
     * CONSTS
     */
    INTCONST(""), DOUBLECONST(""), BOOLEANCONST(""), STRINGCONST(""),

    /**
     * RESERVED WORDS
     */
    IF("if"),ELSE("else"),INT("int"),BOOLEAN("boolean"),
    STRING("String"),VOID("void"),WHILE("while"),NEW("new"),
    BREAK("break"),CONTINUE("continue"),FOR("for"),SWITCH("switch"),
    CASE("case"),DO("do"),RETURN("return"),STRUCT("struct"),
    GOTO("goto"), IMPORT("import");

    private String value;

    public String getValue() {
        return value;
    }

    static public TokenEnum getEnumElementByValue(String value) {
        for(TokenEnum e : TokenEnum.values()) {
            if(e.getValue() == value) {
                return e;
            }
        }

        return null;
    }

    TokenEnum(String value) {
        this.value = value;
    }
}