# Decorator Design Pattern

Var olan kodumuza, mevcut yapıyı bozmadan yeni yetenekler eklemek istediğimizde Decorator tasarım kalıbını kullabiliriz. Yeni kalıtımlar kullanmadan bu durumu çözmek geliştirilmiş kodu değiştirmeden genişletebilmemize olanak sağlar.

## Temel Mantık

Aynı arayüzü implemente eden yeni bir Decorator sınıfı yazarız. Bu sınıfı var olan kodumuzu sarmalayarak genişletmemize olanak sağlar. Bu wrapper sınıf sarmaladığı nesne ile aynı arayüze sahip olduğu için başka wrapper sınıflar tarafından da sarılabilir. Bu da iç içe geçen bir yapı kurgulayabilmemize olanak sağlar

### Component
`UserRepository`: Ortak arayüz.
### Concrete Component
`UserRepositoryImpl`: Temel davranışı gerçekleştiren asıl sınıf.
### Base Decorator
`UserRepositoryDecorator`: Decorator sınıflarımız için abstract sınıf. Arayüzün referansını tutar.
### Concrete Decorators:
* `UserRepositoryLogDecorator`: İşlemlerin süresini ölçer ve log tutar.
* `UserRepositorySecurityDecorator`: İşlem öncesi yetki kontrolü simüle eder.