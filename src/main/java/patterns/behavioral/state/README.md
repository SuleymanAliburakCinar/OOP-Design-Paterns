# State Design Pattern

State pattern, bir nesnenin davranışını koşul kullanmadan (if-else) çalışma zamanında değiştirebilmemize olanak sağlayan tasarım kalıbıdır. Bu tasarım kalıbının işleyişi sonlu durum makinelerine benzetilebilir. 

## Temel Mantık

lgili sınıf (Context) davaranışını stateler üzerinden runtime da otomatik olarak değiştirir. Bu davranış değişiklikleri statelerin (Concrete State) içinde belirlenmiştir. Bu sayede otomatik olarak gerçekleşir. Durumların (Conrete State) ortak bir interface (State) üzerinden ayrı olarak tanımlanması yeni eklenecek durumların mevcut durumları etkilemesinin önüne geçilir.

### Context

Asıl işi yapan ana sınıftır. Bu sınıf State tipinde bir değişken tutarak davranışlarını bu stateler üzerinden belirler.
* `CsvParser`

### State

Tüm durumların uyması gereken ortak yapıdır.
* `ParseState`

### Concrete State

Uyguladığı arayüzdeki metodları gereksinimleri karşılamak üzere gerçekleştiren sınıftır. Context'deki stateler arası geçiş yine bu sınıflar üzerinden gerçekleşir. 
* `QuoteState`, `NotQuoteState`, `AfterQuoteState`