# jphp-graaljs-ext
 
 ![screenshot of sample](https://sun9-3.userapi.com/c858336/v858336670/1761c5/8rBcH8ZxEqI.jpg)
 
 
 Runtime::addJar("jphp-graaljs-ext-all.jar");
        
        $Context = new \graaljs\Context();
        
        $function = $Context->eval("js","x => x+1");
        var_dump($function->canExecute());
        
        $val = $function->execute([41])->asInt();
        var_dump($val);
