<?php

namespace php\graaljs;

abstract class Context
{
    /**
     * <p>Задает контекстный загрузчик классов для этого потока.</p>
     * 
     * @param array $permittedLanguages
     * @return Context
     */
    public function __construct(array ...$permittedLanguages = null)
    {
    }


}
