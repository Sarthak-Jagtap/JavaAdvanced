
sealed class Animal permits Lion, Tiger, Cheeta {}

final class Lion extends Animal {}

non-sealed class Cheeta extends Animal {}

sealed class Tiger extends Animal permits Cow {}

final class Cow extends Tiger {}

public class SealedClassDemo {

}
