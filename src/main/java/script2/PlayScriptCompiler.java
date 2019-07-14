package script2;

import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class PlayScriptCompiler {

    public CompilationRecord Compile(String script) {
        CompilationRecord cr = new CompilationRecord();

        PlayScriptLexer lexer = new PlayScriptLexer(CharStreams.fromString(script));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        PlayScriptParser parser = new PlayScriptParser(tokens);
        cr.ast = parser.prog();

        ParseTreeWalker walker = new ParseTreeWalker();
        AttributeAnalyzer analyzer = new AttributeAnalyzer(cr);
        walker.walk(analyzer, cr.ast);

        return cr;
    }

    public Object Execute(CompilationRecord cr) {
        ObjectVisitor visitor = new ObjectVisitor(cr);
        Object result = visitor.visit(cr.ast);
        return result;
    }

    protected static class ParameterImp implements Parameter {
        protected String name = null;
        protected Type type = null;
        protected Object defaultValue = null;
        protected Integer multiplicity = 1;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Type getType() {
            return type;
        }

        @Override
        public Object getDefaultValue() {
            return defaultValue;
        }

        @Override
        public Integer getMultiplicity() {
            return multiplicity;
        }

    }

    protected static class FieldImp implements Field {
        public String name = null;
        public Type type = null;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Type getType() {
            return type;
        }
    }

    protected static class FunctionImp implements Function {
        protected String name = null;
        protected String namespace = null;
        protected List<Parameter> parameters = new LinkedList<Parameter>();
        protected Type returnType = null;

        protected FunctionImp (String name){
            this.name = name;
        }

        @Override
        public String getNameSpace() {
            return namespace;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<Parameter> parameters() {
            return parameters;
        }

        @Override
        public Type getReturnType() {
            return returnType;
        }
        
    }

    protected static class ClassImp implements script2.Class{

        protected String name = null;
        protected String namespace = null;
        protected List<Field> fields = new LinkedList<Field>();
        protected List<Function> functions = new LinkedList<Function>();

        protected ClassImp(String name){
            this.name = name;
        }

        @Override
        public String getNameSpace() {
            return namespace;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public List<Field> fields() {
            return fields;
        }

        @Override
        public List<Function> functions() {
            return functions;
        }

    }

}