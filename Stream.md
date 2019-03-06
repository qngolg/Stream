# Stream
- Stream是javaApi的新成员，允许声明式的处理数据集合
- Stream是'从支持数据处理操作的源生成的一系列元素'
- Stream利用内部迭代：迭代通过filter、map、sorted等操作都被抽象掉了
- Stream操作有两类： 中间操作和终端操作
- filter和map等中间操作会返回一个Stream，并可以连接在一起，成为一条流水线
- foreach和count等终端操作会返回一个非流的值，并处理流水线以返回结果
- Stream中的元素是按需计算的

- Stream API可以表达复杂的数据处理查询。常用的流操作如下
- 可以使用filter、distinct、skip和limit对流做筛选和切片
- 可以使用map和flatMap提取或转换流中的元素
- 可以使用findFirst和findAny方法查找Stream的元素。同样可以用allMatch、noneMatch和anyMatch方法让流匹配给定的谓词
- 这些方法都利用了短路：找到结果就立即停止计算；没必要处理整个流
- 可以利用reduce方法将流中所有的元素迭代合并成一个结果，例如求和或查找最大元素
- filter和map等操作都是无状态的，他们并不存储任何状态。reduce等操作要存储状态才能计算一个值，sorted和distinct等操作也要存储状态，因为他们需要把流中的所有元素缓存起来才能返回一个新的流。这种操作称为有状态的操作
- Stream有三种基本的元素类型特化：IntSteam、DoubleStream和LongStream，它们都有相应的特化
- Stream不仅可以从集合创建，也可以从值、数组、文件以及iterate与generate等特定方法创建
- 无限流是没有固定大小的流

##Stream的方法集合

### filter
操作类型：`中间操作`

返回类型：`Stream<T>`

使用类型：`Predicate<T>`

函数式描述符： T -> boolean
### distinct 
操作类型：`中间操作（有状态-无界）`

返回类型：`Stream<T>`

使用类型：``

函数式描述符： ``

### skip
操作类型：`中间操作（有状态-有界）`

返回类型：`Stream<T>`

使用类型：`long`

函数式描述符： 

### limit
操作类型：`中间操作（有状态-有界）`

返回类型：`Stream<T>`

使用类型：`long`

函数式描述符： 

### map
操作类型：`中间操作`

返回类型：`Stream<R>`

使用类型：`Function<T,R>`

函数式描述符： T -> R

### flatMap
操作类型：`中间操作`

返回类型：`Stream<T>`

使用类型：`Function<T,Stream<R>>`

函数式描述符： T -> Stream<R>

### sorted
操作类型：`中间操作`

返回类型：`Stream<T>`

使用类型：`Function<T,Stream<R>>`

函数式描述符： T -> Stream<R>

### anyMatch
操作类型：`终端操作`

返回类型：`boolean`

使用类型：`Predicate<T>`

函数式描述符： T -> boolean

### noneMatch
操作类型：`终端操作`

返回类型：`boolean`

使用类型：`Predicate<T>`

函数式描述符： T -> boolean

### allMatch
操作类型：`终端操作`

返回类型：`boolean`

使用类型：`Predicate<T>`

函数式描述符： T -> boolean

### findAny
操作类型：`终端操作`

返回类型：`Optional<T>`

使用类型：``

函数式描述符：

### findFirst
操作类型：`终端操作`

返回类型：`Optional<T>`

使用类型：``

函数式描述符： 

### forEach
操作类型：`终端操作`

返回类型：`void`

使用类型：`Consumer<T>`

函数式描述符： T -> void

### collect
操作类型：`终端操作`

返回类型：`R`

使用类型：`Collector<T,A,R>`

函数式描述符： 

### reduce
操作类型：`终端操作(有状态-有界)`

返回类型：`Optional<T>`

使用类型：`BinaryOperator<T>`

函数式描述符： (T,T) -> T

### count
操作类型：`终端操作`

返回类型：`long`

使用类型：``

函数式描述符： 












    

