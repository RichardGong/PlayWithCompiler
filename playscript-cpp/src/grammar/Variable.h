//
// Created by Richard Gong on 2019-08-01.
//

#pragma once

#include "antlr4-runtime.h"

#include "Symbol.h"
#include "Type.h"

namespace play {
    class Variable {

    protected:
        //变量类型
        Type* type;

        //// 作为parameter的变量的属性
        //缺省值
        //Object defaultValue = null;

        //是否允许多次重复，这是一个创新的参数机制
        size_t multiplicity = 1;

    };

} //namespace


