#include <iostream>
#include "antlr4-runtime.h"
#include "PlayScriptLexer.h"
#include "PlayScriptParser.h"
#include "IRGen.h"
#include "ASTEvaluator.h"

using namespace play;
using namespace antlr4;

int main(int , const char **) {
  //ANTLRInputStream input("double a = 3.0; double foo(double x, double y){return x + y + 2.0;}; foo(3.0, 6.0); a+10.0;");
    ANTLRInputStream input("double foo(double x) { return (1.0+2.0+x)*(x+(1.0+2.0));}");

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

  irGen.InitializeModuleAndPassManager();

  irGen.visit(tree);

  irGen.PrintIR();



  return 0;
}