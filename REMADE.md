# 此项目包含设计模式伪代码及知识点
每个篇幅下都会有对应的REMADE.md文件说明
##  目录说明：
###  创建型设计模式（design-mode-demo.src.main.java.com.create）
>* [工厂模式篇 `Factory Pattern`](src/main/java/com/create/factorypattern/FactoryPatternREADME.md)
>* [抽象工厂模式篇 `Abstract Factory Pattern`](src/main/java/com/create/abstractfactorypattern/AbstractFactoryPatternREADME.md)
>* [单例模式篇 `Singlet Pattern`](src/main/java/com/create/singletonpattern/SingLetonPatternREMADE.md)
>* [建造者模式 `Builder Pattern`](src/main/java/com/create/builderpattern/BuilderPatternREMADE.md)
>* [原型模式 `Prototype Pattern`](src/main/java/com/create/prototypepattern/PrototypePatternREMADE.md)

###  结构型设计模式（design-mode-demo.src.main.java.com.structure）
>* [适配器模式  `Adapter Pattern`](src/main/java/com/structure/adapterpattern/AdapterPatternREMADE.md)
>* [桥接 `Bridge`](src/main/java/com/structure/bridgepattern/BridgerPatternREMADE.md)
>* [组合模式 `Composite Pattern`](src/main/java/com/action/commandpattern/CommandPatternREMADE.md)
>* [装饰器模式 `Decorator Pattern`](src/main/java/com/structure/decoratorpattern/DecoratorPatternREMADE.md)
>* [外观模式 `Facade Pattern`](src/main/java/com/create/factorypattern/FactoryPatternREADME.md)
>* [过滤器模式 `Filter Pattern`或标准模式`Criteria Pattern`](src/main/java/com/structure/filterorcriteriapattern/FilterOrCriteriaPatternREMDE.md)
>* [享元模式 `Flyweight Pattern`](src/main/java/com/structure/flyweightpattern/FlyWeightPatternREMADE.md)
>* [代理模式 `Proxy Pattern`](src/main/java/com/create/prototypepattern/PrototypePatternREMADE.md)

###  行为型设计模式（design-mode-demo.src.main.java.com.action）
>* [状态模式 `State Pattern`](src/main/java/com/action/statepattern/StatePatternREMADE.md)
>* [责任链模式 `Chain of Responsibility Pattern`](src/main/java/com/action/chainofresponsibilitypattern/ChainOfResponsibilityPatternREMADE.md)
>* [命令模式 `Command Pattern`](src/main/java/com/action/commandpattern/CommandPatternREMADE.md)
>* [解释器模式 `Interpreter Pattern`](src/main/java/com/springmvc/interceptingfilterpattern/InterceptingFilterPatternREMADE.md)
>* [迭代器模式 `Iterator Pattern`](src/main/java/com/action/iteratorpattern/IteratorPatternREMADE.md)
>* [中介者模式 `Mediator Pattern`](src/main/java/com/action/mediatorpattern/MediatorPatternREMADE.md)
>* [观察者模式 `Observer Pattern`](src/main/java/com/action/observerpattern/ObserverPatternREMADE.md)
>* [空对象模式 `Null Object Pattern`](src/main/java/com/action/nullobjectpattern/NullObjectPatternREMADE.md)
>* [备忘录模式 Memento Pattern](src/main/java/com/action/mementopattern/MementoPatternREMAD.md)
>* [策略模式 Strategy Pattern](src/main/java/com/action/strategypattern/StrategyPatternREMADE.md)
>* [模板模式 Template Pattern](src/main/java/com/action/templatepattern/TemplatePatternREMADE.md)
>* [访问者模式 Visitor Pattern](src/main/java/com/action/vsitorpattern/VisitorPatternREMADE.md)

###  Spring MVC设计模式（design-mode-demo.src.main.java.com.springmvc）
>* [业务代表模式 Business Delegate Pattern](src/main/java/com/springmvc/businessdelegateatter/BusinessDelegatePatterREMADE.md)
>* [组合实体模式 Composite Entity Pattern](src/main/java/com/springmvc/compositeentitypattern/CompositeEntityPatternREMADE.md)
>* [数据访问对象模式 Data Access Object Pattern](src/main/java/com/springmvc/dataaccessobjectpattern/DataAccessObjectPatternREMADE.md)
>* [前端控制器模式 Front Controller Pattern](src/main/java/com/springmvc/frontcontrollerpattern/FrontControllerPatternREMADE.md)
>* [拦截过滤器模式 Intercepting Filter Pattern](src/main/java/com/springmvc/interceptingfilterpattern/InterceptingFilterPatternREMADE.md)
>* [MVC 模式代表 Model-View-Controller](src/main/java/com/springmvc/mvcpattern/Model-View-ControllerREMADE.md)
>* [服务定位器模式 Service Locator Pattern](src/main/java/com/springmvc/servicelocatorpattern/ServiceLocatorPatternREMADE.md)


---

---

###  多线程问题源头：
>* 原子性
>* 可见性
>* 有序性
###  多线程volatile关键字 ：
>* 可见性：被volatile所修饰的变量对所有线程总数可见，比如说一个线程修改了该变量信息，其他线程立即得知、
>* 禁止指令重排优化，从而避免多线程环境下程序出现乱序执行的现象
  
参考作者网址：

https://www.w3cschool.cn/shejimoshi/singleton-pattern.html

https://www.w3cschool.cn/javadesignpattern/fu831mvl.html
