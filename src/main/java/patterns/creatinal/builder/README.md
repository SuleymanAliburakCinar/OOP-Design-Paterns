# Builder Design Pattern

Parametre sayısının fazlalaştığı durumlarda constructor ile object oluşturulması zorlaşır. Bu durumlar için builder deseni kullanılabilir. Bu seyede gerekli ve opsiyonel parametreler ayrılarak object oluşturulmasında esneklik sağlanır.

## Temel Mantık

Objeler constructor ile oluştururken uzun ve karmaşık parametreler girilmek yerine builder deseni ile ilgili alanlar doldurularak object oluşturulması sağlanır. Doldurulması gerekli alanlar varsa bu alanlar yine Builder sınıfının constructorına eklenerek doldurulması garanti edilebilir.

### 1. Inner Class Builder

İlgili sınıfın içinde public static bir builder sınıfı oluşturulur. Bu builder sınıfı ilgili sınıfın constructor parametreleri ile aynı parametreleri alır. Doldurulması zorunlu alanlar varsa Builder sınıfındaki constructora parametre olarak bu alanlar verilir. Doldurulması isteğe bağlı alanlar kendi sınıfı tipinde değer dönen metotlar ile doldurulur. Bu metotlar en son kendilerini döndürür. Hedef sınıfın içinde parametre olarak Builder sınıfını alan bir constructor oluşturulur. Bu constructor builder sınıfından bir object oluşturulur. En son Builder sınıfındaki build metodu ile bu constructor çağrılarak hedef sınıf adına object esnek bir şekilde oluşturulmuş olur.

### 2. Generic Builder

Java 8 ile birlikte gelen lambda ifadeleri ve functional interface ile hedef sınıfın constructorı ve setterları kullanılarak generic bir builder oluşturulabilir. of metodu ile ilgili sınıf oluşturulur. with metotları ile ilgili alanların setter metodları kullanılarak değer atama işlemi yapılır. En son build metodu ile hedef sınıf adına object oluşturulmuş olur.