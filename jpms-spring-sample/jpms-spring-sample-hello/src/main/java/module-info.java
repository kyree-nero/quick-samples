module hello.modules {
    exports sample.hello;
    requires spring.beans;
    requires spring.context;
    provides sample.hello.HelloInterface with sample.hello.HelloModules;
}