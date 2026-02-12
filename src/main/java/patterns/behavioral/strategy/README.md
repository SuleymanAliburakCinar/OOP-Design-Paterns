# Strategy Design Pattern

Strategy pattern, bir işin farklı yöntemlerle yapılabileceğini bildiğimiz, bu yöntemleri çalışma zamanında seçeceğimiz bir davranışsal tasarım desenidir. Çalışma anında (runtime) algoritma değiştirmek için if else blokları kullanmanın önüne geçer. Böylece kod daha esnek, anlaşılır ve bakımı kolay hale gelir.

## Temel Mantık

Bir sınıfa (Context) tüm iş mantığını ve varyasyonlarını yüklemek yerine, işin nasıl yapılacağını ayrı strateji sınıflarına devredilir. Bu sayede ana sınıf, hangi yöntemin kullanıldığını bilmesine gerek kalmadan işini yapabilir.

### 1. Strategy (Arayüz / Interface)
Tüm stratejilerin uyması gereken ortak yapıdır.
*   "İndirim nasıl uygulanır?" sorusunun yanıtıdır.

### 2. Concrete Strategy (Somut Stratejiler)
Algoritmanın farklı uygulama biçimleridir.
*  Kendine has indirim mantığını icra etmek.

### 3. Context (Bağlam)
Stratejiyi içinde barındıran ve asıl işi yapan sınıftır.
*  Ürünleri yönetmek ve fiyatı hesaplarken o anki indirim stratejisine uygulamak.
