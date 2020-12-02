# 此项目包含设计模式伪代码及知识点
每个篇幅下都会有对应的REMADE.md文件说明
#### 说明：
##### 创建型设计模式（design-mode-demo.src.main.java.com.create）
>* 工厂模式篇 `Factory Pattern`
>* 抽象工厂模式篇 `Abstract Factory Pattern`
>* 单例模式篇 `Singlet Pattern`
>* 建造者模式 `Builder Pattern`
>* 原型模式 `Prototype Pattern`

##### 结构型设计模式（design-mode-demo.src.main.java.com.structure）
>* 适配器模式  `Adapter Pattern`
>* 桥接 `Bridge`
>* 组合模式 `Composite Pattern`
>* 装饰器模式 `Decorator Pattern`
>* 外观模式 `Facade Pattern`
>* 过滤器模式 `Filter Pattern`或标准模式`Criteria Pattern`
>* 享元模式 `Flyweight Pattern`
>* 代理模式 `Proxy Pattern`

##### 行为型设计模式（design-mode-demo.src.main.java.com.action）
>* 状态模式 `State Pattern`
>* 责任链模式 `Chain of Responsibility Pattern`
>* 命令模式 `Command Pattern`
>* 解释器模式 `Interpreter Pattern`
>* 迭代器模式 `Iterator Pattern`
>* 中介者模式 `Mediator Pattern`
>* 观察者模式 `Observer Pattern`
>* 空对象模式 `Null Object Pattern`

---

---

#### 多线程问题源头：
>* 原子性
>* 可见性
>* 有序性
### 多线程volatile关键字 ：
>* 可见性：被volatile所修饰的变量对所有线程总数可见，比如说一个线程修改了该变量信息，其他线程立即得知、
>* 禁止指令重排优化，从而避免多线程环境下程序出现乱序执行的现象
  
参考作者网址：

https://www.w3cschool.cn/shejimoshi/singleton-pattern.html

https://www.w3cschool.cn/javadesignpattern/fu831mvl.html
