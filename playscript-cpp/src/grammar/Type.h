//
// Created by Richard Gong on 2019-08-01.
//
#pragma once

#include "Scope.h"

namespace play{

class Type {

public:
    virtual std::string* getName();


    virtual Scope* getEnclosingScope();
};

}


