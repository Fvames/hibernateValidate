### 序言
   
 数据校验是任何一个应用程序都会用到的功能,无论是显示层还是持久层.
 通常,相同的校验逻辑会分散在各个层中,这样不仅浪费了时间还会导致重复代码.
 为了避免重复,开发人员经常会把这些校验逻辑直接写在领域模型(domain model)里,但是这样又把领域模型与校验代码混杂在了一起,而这些校验逻辑更应该是描述领域模型的元数据.
  ![](images/application-layers.png)
  
  JSR 303 - Bean Validation:为实体验证定义了元数据模型和API.默认的元数据模型是通过Annotations来描述的,但是也可以使用XML来重载或扩展.
  ![](images/application-layers-JSR.png)
  
  Hibernate Validator是JSR的一种实现,提供了JSR规范中所有内置constraint的实现,除此之外还有一些附加的constraint.
  
  Hibernate Validator的使用非常简单,只用在相应的实体类中加上注解,再调用对应的校验API方法即可.