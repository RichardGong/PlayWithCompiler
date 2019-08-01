#pragma once

#include "antlr4-runtime.h"

#include "Scope.h"

namespace play
{
    class Scope;

class Symbol
{
public:

protected:

     //符号的名称
    std::string name;

    //所属作用域
    Scope* enclosingScope;

    //可见性，比如public还是private
    size_t visibility = 0;

    //Symbol关联的AST节点
    antlr4::ParserRuleContext* ctx;

};

}//namespace
