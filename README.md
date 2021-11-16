环境
jdk 11
spring 5.3.x
gradle 5.6.3

编译顺序
Tasks->other->compileTestJava
core->oxm->context->beans->aspects->aop


obtainFreshBeanFactory子流程:
org.springframework.context.support.AbstractRefreshableApplicationContext.loadBeanDefinitions
    org.springframework.context.support.AbstractXmlApplicationContext.loadBeanDefinitions
        org.springframework.beans.factory.support.AbstractBeanDefinitionReader.loadBeanDefinitions
            org.springframework.beans.factory.support.BeanDefinitionReader.loadBeanDefinitions
                org.springframework.beans.factory.xml.XmlBeanDefinitionReader.doLoadBeanDefinitions 读取xml为document对象完成

                    org.springframework.beans.factory.xml.XmlBeanDefinitionReader.registerBeanDefinitions (注册开始)

                        org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.registerBeanDefinitions
                            org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.doRegisterBeanDefinitions
                                org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseBeanDefinitions
                                    org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.parseDefaultElement
                                        org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader.processBeanDefinition
                                            org.springframework.beans.factory.support.BeanDefinitionReaderUtils.registerBeanDefinition
                                                org.springframework.beans.factory.support.DefaultListableBeanFactory.registerBeanDefinition

