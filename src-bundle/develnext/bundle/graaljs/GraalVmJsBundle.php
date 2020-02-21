<?php

namespace develnext\bundle\graaljs;

use ide\bundle\AbstractBundle;
use ide\bundle\AbstractJarBundle;
use ide\formats\ScriptModuleFormat;
use ide\Ide;
use ide\library\IdeLibraryBundleResource;
use ide\project\Project;
use php\io\File;
use php\desktop\Runtime;

class GraalVmJsBundle extends AbstractJarBundle
{
    public function onAdd(Project $project, AbstractBundle $owner = null)
    {
        parent::onAdd($project, $owner);

        Ide::get()->getMainForm()->toast("GraalVM Polyglot API for Jphp  ...");
    }

    public function onRemove(Project $project, AbstractBundle $owner = null){
        parent::onRemove($project, $owner);
    }

    public function onRegister(IdeLibraryBundleResource $resource){
        parent::onRegister($resource);
    }
}