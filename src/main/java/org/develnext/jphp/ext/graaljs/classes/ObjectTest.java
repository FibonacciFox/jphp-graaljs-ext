package org.develnext.jphp.ext.graaljs.classes;


import org.develnext.jphp.ext.graaljs.GraalJsExtension;
import org.graalvm.polyglot.Context;

import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Namespace;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.reflection.ClassEntity;

@Name("ObjectTest")
@Namespace(GraalJsExtension.NS)
public class ObjectTest extends BaseObject {

    public ObjectTest(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public class JavaRecord {

        // @HostAccess.Export
        public int x;
        public Object[] value;

        JavaRecord(Object... value) {
            this.value = value;
        }

        // @HostAccess.Export
        public String name() {
            return "foo";
        }
    }

    @Signature
    public String hello(Object obj)  {

        /*
         * Context context = Context.newBuilder().allowAllAccess(true).build();
         * 
         * JavaRecord record = new JavaRecord(1, "hello");
         * context.getBindings("js").putMember("javaRecord", record);
         * 
         * context.eval("js", "javaRecord.x = 42"); assert record.x == 42;
         * 
         * for (int i = 0; i < record.value.length; i++) { System.out.println("objects["
         * + i + "] = " + record.value[i]); }
         * 
         * Set<String> num = context.eval("js", "javaRecord").getMemberKeys();
         * System.out.println("1: "+ num); return context.eval("js",
         * "javaRecord.name()").asString().equals("foo");
         */

        
        return "";
    }

}