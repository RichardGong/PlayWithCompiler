#include <iostream>
#include "antlr4-runtime.h"
#include "PlayScriptLexer.h"
#include "PlayScriptParser.h"

using namespace play;
using namespace antlr4;

int main(int , const char **) {
  ANTLRInputStream input("45+10*2;println(3); 3;");
  PlayScriptLexer lexer(&input);
  CommonTokenStream tokens(&lexer);

  tokens.fill();
  for (auto token : tokens.getTokens()) {
    std::cout << token->toString() << std::endl;
  }

  PlayScriptParser parser(&tokens);
  tree::ParseTree *tree = parser.prog();

  std::cout << tree->toStringTree(&parser) << std::endl;

  return 0;
}