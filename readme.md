# 金额转大写工具

## 示例

```shell
101 -> 壹佰零壹圆整
```

```shell
102 -> 壹佰零贰圆整
```

```shell
3573 -> 叁仟伍佰柒拾叁圆整
```

```shell
567853256 -> 伍亿陆仟柒佰捌拾伍万叁仟贰佰伍拾陆圆整
```

```shell
28.245f -> 贰拾捌圆贰角肆分
```

```shell
657895214756L -> 陆仟伍佰柒拾捌亿玖仟伍佰贰拾壹万肆仟柒佰伍拾陆圆整
```


## 使用

```java
String dealMoney = MoneyUtils.dealMoney(28.5f);
```
