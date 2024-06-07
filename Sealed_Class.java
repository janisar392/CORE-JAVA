
sealed class A permits B, C  // only B and C can access
{

}

final class B extends A  // nobody can access
{

}

sealed class C extends A //No-one can access
                         // if it not permit
{

}

non-sealed class D extends C   // anyone can access
{

}

// class E extends A    // not giving permits
// {

// }

public class Sealed_Class {
    
}
