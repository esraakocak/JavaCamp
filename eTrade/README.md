# Bir e-ticaret sisteminde sisteme kayıt ve sisteme giriş için gerekli gereksinim ve kabul kriterleri
→ Kullanıcılar sisteme bilgilerini girerek üye olabilmelidir.
-Sisteme temel kullanıcı bilgileri , e-posta ve parolayla üye olunabilmelidir. Temel kullanıcı bilgileri : ad, soyad, e-posta, parola. Temel bilgilerin tamamı zorunludur.

- Parola en az 6 karakterden oluşmalıdır.

- E-posta alanı e-posta formatında olmalıdır. (Regex ile yapınız)

- E-Posta daha önce kullanılmamış olmalıdır.

- Ad ve soyad en az iki karakterden oluşmalıdır.

- yelik sonucu kullanıcıya doğrulama e-postası gönderilmelidir. (Simulasyon)

- Doğrulama linki tıklandığında üyelik tamamlanmalıdır. (Simulasyon)

- Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.

# Kullanıcılar sisteme Google hesapları ile üye olabilmelidir. (Simulasyon)

-E-posta ve parola zorunludur.

-Hatalı veya başarılı durumda kullanıcı bilgilendirilmelidir.
## REGEX :
→ Regular Expressions (Regex veya Regexp / Düzenli / Kurallı İfadeler) modern programlama dillerinin neredeyse tamamında yer bulan, aynı söz dizimine1 (syntax) sahip olan,genellikle harflerden olusan karakterler dizisinin (katar2 / string) belirtilen kurallar çerçevesinde kısa yoldan ve esnek bir biçimde belirlenmesini sağlayan bir yapıdır.

Sistemde mail için kullanılan regex örneği : ^[A-Za-z0-9+_.-]+@(.+)$

^ → İfade başlangıcı olduğunu belirtir.

$ → İfade ya da satır sonu olduğunu belirtir.

+→ 1 veya daha fazla karakter gelebilir anlamına gelmektedir.

[] → Karakter aralığı belirlemede kullanılır.

() → İfadeyi gruplandırır.

. → Herhangi bir karakterin gelebileceği anlamına gelir.

[A-Za-z0-9] → A dan Z ye kadar bütün harfleri ve 0 dan 9 a kadar bütün sayıları içeren karakter gruplarının örüntüsü
