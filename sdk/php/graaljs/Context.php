<?php

namespace php\graaljs;

abstract class Context
{
    /**
     * @param string $permittedLanguages
     * 
     * @return Context
     */
    public function __construct(string $permittedLanguages = null)
    {
    }
}
