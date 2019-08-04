#include <iostream>
#include "antlr4-runtime.h"
#include "PlayScriptLexer.h"
#include "PlayScriptParser.h"
#include "IRGen.h"
#include "ASTEvaluator.h"
#include "PlayScriptJIT.h"

using namespace play;
using namespace antlr4;

int main(int, const char **) {

    InitializeNativeTarget();
    InitializeNativeTargetAsmPrinter();
    InitializeNativeTargetAsmParser();

    //ANTLRInputStream input("double a = 3.0; double foo(double x, double y){return x + y + 2.0;}; foo(3.0, 6.0); a+10.0;");
    ANTLRInputStream input("double foo(double x) { return (1.0+2.0+x)*(x+(1.0+2.0));}  foo(3.0);");


    PlayScriptLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    tokens.fill();
    for (auto token : tokens.getTokens()) {
        std::cout << token->toString() << std::endl;
    }

    PlayScriptParser parser(&tokens);
    tree::ParseTree *tree = parser.prog();

    std::cout << tree->toStringTree(&parser) << std::endl;

    //ASTEvaluator astEvaluator;

    //astEvaluator.visit(tree);

    IRGen irGen;

//    TheJIT = llvm::make_unique<PlayScriptJIT>();

    irGen.InitializeModuleAndPassManager();

    //    std::unique_ptr<PlayScriptJIT> TheJIT;
//    DataLayout dl = TheJIT->getTargetMachine().createDataLayout();
//    TheModule->setDataLayout(dl);

    irGen.visit(tree);

    irGen.PrintIR();

    irGen.ExecuteJIT();


    return 0;
}