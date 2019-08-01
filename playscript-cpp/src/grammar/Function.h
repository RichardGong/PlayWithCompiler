//
// Created by Richard Gong on 2019-08-01.
//
#pragma once

#include "Scope.h"
#include "Type.h"
#include "Variable.h"

namespace play{

    class Function : Scope{

    public:

        // 参数
    protected:
        std::vector<Variable> parameters;

        //返回值
        Type* returnType;

    private:
        std::vector<Type> paramTypes;

    };

}


