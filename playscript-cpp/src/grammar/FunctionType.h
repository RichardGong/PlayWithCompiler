//
// Created by Richard Gong on 2019-08-01.
//
#pragma once

#include "Type.h"

namespace play{

    class FunctionType : public Type{

    public:

    const Type* getReturnType();

    std::vector <Type&> getParamTypes();

    };

}


