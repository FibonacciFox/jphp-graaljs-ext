<?php

namespace php\graaljs;


abstract class Context
{
    /**
     * @param array $permittedLanguages
     * 
     * @return Context {}
     */
    public function __construct(array $permittedLanguages = null)
    {
    }
}
