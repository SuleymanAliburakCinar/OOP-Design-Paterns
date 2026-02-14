# Composite Design Pattern

Composite pattern, nesneleri ağaç yapısına göre düzenleyerek "parça-bütün" hiyerarşileri oluşturmamızı sağlayan yapısal bir tasarım desenidir. [Anlatımlı kod örneği](https://playbackpress.com/books/patternsbook/chapter/1/3?comment=1)

## Temel Mantık

Client, işlem yapacağı nesnenin tek bir parça mı yoksa birçok parçadan oluşan bir yapı mı olduğunu bilmek zorunda kalmaz. Tüm nesneler aynı abstract sınıfı veya arayüzü uyguladığı için, hiyerarşi derinliği ne olursa olsun işlemler recursive (özyinelemeli) bir şekilde tüm ağaca yayılabilir.

### 1. Component (FileSystemItem)
Hem leaf hem composite'in ortak özelliklerini ve metodlarını tanımlayan abstract sınıftır.
*   `display()`, `getSize()`, `delete()` gibi ortak işlemleri tanımlar.

### 2. Leaf (File)
Hiyerarşinin en alt katmanındaki, içinde başka nesne barındırmayan tekil nesnedir.
*   İşlemleri (display, get size vb.) doğrudan kendi verisi üzerinde gerçekleştirir.

### 3. Composite (Directory)
İçinde hem yaprakları (Leaf) hem de diğer kompozitleri barındırabilen nesnedir.
*   Çocuklarını (`children`) yönetmek için ekleme (`add`) ve çıkarma (`remove`) metodlarına sahiptir.
*   İşlemleri kendi içindeki tüm çocuklara devrederek sonuçları toplar.