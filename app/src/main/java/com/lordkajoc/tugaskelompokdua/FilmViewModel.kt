package com.lordkajoc.tugaskelompokdua

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    private val list = arrayListOf(
        DataFilm(
            R.drawable.spiderman123,
            "Spider-Man: No Way Home",
            " 15 Desember 2021",
            "8,2/10",
            "Setelah Quentin Beck menjebak Peter Parker atas pembunuhannya dan mengungkapkan identitas Parker sebagai Spider-Man,[a] Parker, kekasihnya Michelle \"MJ\" Jones-Watson, sahabatnya Ned Leeds, dan bibi May diinterogasi oleh Departemen Pengendalian Kerusakan. Pengacara Matt Murdock berhasil membatalkan tuntutan Parker, namun kelompok ini bergulat dengan publisitas negatif. Setelah aplikasi MIT Parker, MJ, dan Ned ditolak, Parker pergi ke New York Sanctum untuk meminta bantuan Stephen Strange. Strange mulai merapal mantra yang akan membuat semua orang lupa bahwa Parker adalah Spider-Man, namun mantra tersebut rusak ketika Parker berulang kali meminta perubahan agar orang-orang yang dicintainya tetap memiliki ingatan, yang pada akhirnya membuat Strange menahan mantra tersebut untuk menghentikannya.\n" +
                    "\n" +
                    "Atas saran Strange, Parker mencoba meyakinkan administrator MIT untuk mempertimbangkan kembali aplikasi MJ dan Ned, tetapi diserang oleh Otto Octavius. Octavius merobek nanoteknologi dari kostum Iron Spider milik Parker, yang terikat dengan tentakel mekanisnya dan memungkinkan Parker untuk mengendalikannya. Saat Norman Osborn tiba dan menyerang, Strange memindahkan Parker kembali ke Sanctum dan mengunci Octavius di dalam sel di samping Curt Connors. Strange menjelaskan bahwa mantra yang rusak itu memanggil orang-orang dari alam semesta lain dalam multiverse yang mengetahui identitas Spider-Man. Dia memerintahkan Parker, MJ, dan Ned untuk menemukan dan menangkap mereka; mereka menemukan dan mengambil Max Dillon dan Flint Marko di sebuah fasilitas penelitian militer.\n" +
                    "\n" +
                    "Osborn mendapatkan kembali kendali atas dirinya dari kepribadian Green Goblin yang terpecah dan menghancurkan topeng Goblin. Dia pergi ke gedung F.E.A.S.T., di mana May menghiburnya sebelum Parker mengambilnya. Ketika mendiskusikan pertempuran mereka dengan Spider-Man, Osborn, Octavius, dan Dillon menyadari bahwa mereka ditarik dari alam semesta mereka sebelum kematian mereka.[b] Strange bersiap untuk membalikkan mantra yang ada dan mengirim para penjahat kembali ke alam semesta masing-masing, tetapi Parker berpendapat bahwa mereka harus terlebih dahulu menyembuhkan para penjahat dari kegilaan yang akan menyebabkan kematian mereka, untuk mengubah nasib mereka saat kembali. Ketika Strange menolak, Parker mencuri mantranya, menjebak Strange di Dimensi Cermin, dan, bersama May, membawa para penjahat ke apartemen Happy Hogan, di mana dia menggunakan teknologi Stark Industries untuk menyembuhkan Octavius. Sebelum Parker dapat menyembuhkan orang lain, indera laba-labanya berbunyi. Dia kemudian menemukan bahwa persona Goblin mengambil alih kendali Osborn, yang meyakinkan para penjahat yang belum disembuhkan untuk mengkhianati Parker. Saat Dillon, Marko, dan Connors melarikan diri, Goblin melukai May secara fatal. Sebelum meninggal, May memberi tahu Parker bahwa \"dengan kekuatan yang besar, pasti ada tanggung jawab yang besar\".\n" +
                    "\n" +
                    "Ned menemukan bahwa ia dapat membuat portal menggunakan cincin selempang Strange, yang digunakannya dan MJ untuk mencari Parker. Mereka malah menemukan versi alternatif Parker dari alam semesta penjahat yang juga dipanggil oleh mantra Strange dan dijuluki \"Peter-Two\" dan \"Peter-Three\". Kelompok ini menemukan Parker dari alam semesta ini, yang dijuluki \"Peter-One\", yang siap untuk menyerah dan mengirim para penjahat pulang untuk mati. Para Parker alternatif berbagi cerita tentang kehilangan orang yang dicintai dan mendorong Peter-One untuk bertarung demi menghormati May, dan ketiga Parker mengembangkan obat untuk para penjahat.\n" +
                    "\n" +
                    "Kelompok ini memikat Dillon, Marko, dan Connors ke Patung Liberty. Peter-One dan Peter-Two menyembuhkan Connors dan Marko, sementara Octavius datang untuk membantu menyembuhkan Dillon, dan Ned membebaskan Strange dari Dimensi Cermin. Goblin muncul dan melepaskan mantra yang terkandung di dalamnya, yang memecah penghalang antara alam semesta, menarik banyak orang lain yang mengetahui identitas Parker. Strange berusaha menahan mereka sementara Peter-One yang marah mencoba membunuh Goblin. Peter-Two menghentikannya, tetapi ditikam oleh Goblin. Peter-Three membantu Peter-One menyuntik Goblin dengan obatnya, memulihkan kewarasan Osborn. Peter-One menyadari bahwa satu-satunya cara untuk melindungi multiverse adalah dengan menghapus Peter Parker dari ingatan semua orang dan meminta Strange untuk melakukannya sambil berjanji kepada MJ dan Ned bahwa dia akan menemukan mereka kembali. Strange dengan enggan mengucapkan mantranya, dan semua orang kembali ke alam semesta masing-masing-termasuk Eddie Brock,[c] yang tanpa sadar meninggalkan sepotong simbiot Venom.\n" +
                    "\n" +
                    "Dua minggu kemudian, Parker mengunjungi MJ untuk memperkenalkan dirinya kembali, namun dia memutuskan untuk tidak melakukannya. Saat berkabung di makam May, dia berbincang dengan Hogan dan terinspirasi untuk melanjutkannya, membuat setelan baru."
        ),
        DataFilm(
            R.drawable.spidermanhome,
            "Spider-Man: Homecoming",
            "7 Juli 2017",
            "7,4/10",
            "Setelah Pertempuran New York, Adrian Toomes dan perusahaan penyelamatnya dikontrak untuk membersihkan kota, tetapi operasi mereka diambil alih oleh Department of Damage Control (DODC), kemitraan antara Tony Stark dan pemerintah AS . Marah karena diusir dari bisnis, Toomes membujuk karyawannya untuk menjaga teknologi Chitauri yang telah mereka peroleh dan menggunakannya untuk membuat dan menjual senjata canggih. Delapan tahun kemudian, Peter Parker direkrut ke dalam Avengers oleh Stark untuk membantu dengan perselisihan internal di Berlin, tetapi melanjutkan studinya di Sekolah Sains dan Teknologi Midtown ketika Stark mengatakan kepadanya bahwa ia belum siap untuk menjadi Avenger sepenuhnya.\n" +
                    "\n" +
                    "Parker keluar dari tim dekathlon akademik sekolahnya untuk menghabiskan lebih banyak waktu dengan fokus pada kegiatan memerangi kejahatannya sebagai Spider-Man. Suatu malam, setelah mencegah penjahat merampok ATM dengan senjata canggih mereka, Toomes menjualnya, Parker kembali ke apartemennya di Queens, tempat sahabatnya Ned menemukan identitas rahasianya. Pada malam lain, Parker bertemu dengan rekan kerja Toomes, Jackson Brice / Shocker dan Herman Schultz yang menjual senjata kepada penjahat lokal Aaron Davis. Parker menyelamatkan Davis sebelum ditangkap oleh Toomes dan jatuh di sebuah danau, hampir tenggelam setelah kusut dalam parasut yang terpasang di jasnya. Dia diselamatkan oleh Stark, yang memantau jas Spider-Man yang dia berikan kepada Parker dan memperingatkannya agar tidak terlibat lebih jauh dengan para penjahat. Toomes secara tidak sengaja membunuh Brice dengan salah satu senjata mereka, dan Schultz menjadi Shocker baru.\n" +
                    "\n" +
                    "Parker dan Ned mempelajari senjata yang ditinggalkan Brice, melepaskan inti kekuatannya. Ketika alat pelacak di Schultz mengarah ke Maryland, Parker bergabung kembali dengan tim dasalomba dan menemani mereka ke Washington, D.C. untuk turnamen nasional mereka. Ned dan Parker menonaktifkan pelacak yang ditanamkan Stark di setelan Spider-Man, dan membuka fitur-fitur canggihnya. Parker mencoba menghentikan Toomes dari mencuri senjata dari D.O.D.C. truk, tetapi terjebak di dalam, menyebabkan dia ketinggalan turnamen dasalomba. Ketika ia menemukan bahwa inti kekuatan adalah granat Chitauri tidak stabil, Parker berlari ke Monumen Washington, di mana inti meledak dan menjebak Ned dan teman-teman mereka di lift. Menghindari pihak berwenang setempat, Parker menyelamatkan teman-temannya, termasuk teman sekelasnya dan kekasih Liz. Kembali ke New York City, Parker membujuk Davis untuk mengungkapkan keberadaan Toomes. Di atas Staten Island Ferry, Parker menangkap pembeli baru Toomes, Mac Gargan, tetapi Toomes lolos dan senjata yang tidak berfungsi merobek setengah kapal itu. Stark membantu Parker menyelamatkan penumpang dan menghilangkan pakaiannya itu karena kecerobohannya.\n" +
                    "\n" +
                    "Parker kembali ke kehidupan sekolah menengahnya, dan akhirnya meminta Liz untuk pergi ke pesta dansa bersamanya. Pada malam pesta dansa, Parker menemukan bahwa Toomes adalah ayah Liz. Mengaburkan identitas rahasia Parker dari akun Liz tentang dirinya, Toomes mengancam akan pembalasan jika ia mengganggu rencananya. Selama tarian, Parker menyadari Toomes berencana untuk membajak seorang D.O.D.C. pesawat mengangkut senjata dari Avengers Tower ke markas baru tim, mengenakan setelan Spider-Man buatannya, dan berlari ke sarang Toomes. Meskipun dia disergap oleh Schultz, dia mengalahkannya dengan bantuan Ned. Di sarang, Toomes menghancurkan balok penyangga gedung dan membiarkan Parker mati. Parker lolos dari puing-puing dan mencegat pesawat, mengarahkannya untuk jatuh di pantai dekat Pulau Coney. Dia dan Toomes terus bertarung, berakhir dengan Parker menyelamatkan nyawa Toomes setelah jas Vulture yang rusak meledak, dan meninggalkannya untuk polisi bersama dengan kargo pesawat. Setelah penangkapan ayahnya, Liz pindah, Parker menolak undangan dari Stark untuk bergabung dengan Avengers penuh waktu, dan Stark melamar Pepper Potts. Dia juga mengembalikan setelan Spider-Man ke Parker, yang mengenakannya di kamarnya tepat saat Bibi May masuk.\n" +
                    "\n" +
                    "Dalam adegan mid-credit, Gargan dipenjara mendekati Toomes di penjara, mengatakan ia telah mendengar bahwa yang terakhir tahu identitas asli Spider-Man, yang Toomes bantah."
        ),
        DataFilm(
            R.drawable.horor1,
            "Ivana",
            " 20 Agustus 2022",
            "9,1/10",
            "IVANNA juga menjadi film horor Indonesia yang populer di bulan Agustus 2022. Film ini juga masih tayang di bioskop dengan kisahnya yang seru. Berangkat dari novel karya Risa Saraswati, IVANNA mengisahkan tentang dendam hantu perempuan Belanda.\n" +
                    "Seorang wanita bernama Ambar memiliki kemampuan melihat Ivanna hingga mendapat teror darinya. Sementara itu hantu Ivanna sendiri diketahui meninggal tidak wajar bahkan tanpa kepala. Ancaman dari hantu Ivanna semakin serius saat ada sejumlah orang meninggal karenanya."
        ),
        DataFilm(
            R.drawable.horor2,
            " Pengabdi Setan 2: Communion",
            "  04 Agustus 2022",
            "8,7/10",
            "Mengangkat genre horor, film yang disutradarai oleh Joko Anwar ini mengisahkan tentang kehidupan Rini, Toni, Bapak, setelah kematian ibu.\n" +
                    "Rini dan keluarganya memutuskan pindah ke rumah susun di Jakarta. Menjalani hari-hari seperti biasa, datanglah saat mencekam ketika keluarga Rini mendapat teror horor di rusun. Saat itu badai tengah melanda Jakarta hingga menyebabkan banjir dan listrik padam. Saat bersamaan penghuni rusun mulai meninggalkan tempat tinggal mereka. Begitu juga dengan Rini yang bertekad untuk pergi sementara.\n" +
                    "\n" +
                    "Namun para penghuni rusun justru mengalami kecelakaan saat berada di lift. Mereka meninggal seketika, namun mayatnya harus disemayamkan sebentar di rusun lantaran tengah banjir. Situasi semakin mencekam ketika Rini dan keluarganya mendapat teror horor dari hantu menyeramkan. Terlebih ia juga penasaran dengan pekerjaan ayahnya yang terkesan misterius."
        ),
        DataFilm(
            R.drawable.mariobos,
            "The Super Mario Bros. Movie",
            "20 Februari 2023",
            "4.7",
            "Kisah Mario (Chris Pratt) si tukang ledeng yang melakukan perjalanan heroik untuk menyelamatkan saudaranya, Luigi (Charlie Day). Di perjalanan, Mario tidak sendiri, ia dibantu oleh Putri Peach (Anya Taylor-Joy) dan prajurit kerajaan jamur."
        ),
        DataFilm(
            R.drawable.temantidur,
            "Teman Tidur",
            "10 Januari 2023",
            "4.5",
            "Amanda merupakan siswi pindahan, ia tinggal di asrama agar bisa fokus mengikuti olimpiade biologi. Disana ia bertemu dengan Adam dan gengnya, sahabat baru yang membantunya dari siksaan geng siswa bully. Kedekatan Amanda dan Geng Adam memicu reaksi sinis dari Davin yang merupakan siswa unggulan. Davin masih tertekan atas kepergian sahabatnya, Kelly yang bunuh diri karena video erotisnya yang viral, ia mencurigai Geng Adam sebagai penyebar video tersebut. Perlahan, sosok arwah Kelly datang menghantui mereka melalui terror chat video, meminta keadilan atas misteri kematiannya."
        ),
        DataFilm(
            R.drawable.tulah,
            "Tulah",
            "01 Januari 2023",
            "4.4",
            "Gilang (21 thn) memutuskan untuk berlibur bersama Sarah dan Kevin, dua orang sahabatnya sejak SMA untuk merayakan ulang tahunnya. Rencana tersebut terganggu dengan kehadiran dua orang tamu tak diundang, suasana semakin tidak menyenangkan ketika mereka mulai memasuki sebuah hutan, Dimulai dengan penampakan sosok kakek misterius dengan seorang anak kecil yang menyeramkan. Rentetan teror yang tidak terduga mulai terjadi dan mengganggu mereka yang membuat Gilang harus terpisah dengan teman-temannya dan menggiring Gilang ke sebuah kutukan masa lalu yang sangat mengerikan. Apakah Gilang dan teman-temannya sanggup bertahan dan mampu melewati kejadian-kejadian aneh dan teror-teror yang mulai mengancam nyawa mereka?"
        ),
        DataFilm(
            R.drawable.baby,
            "Baby Driver",
            "11 Maret 2017",
            "4.5",
            "Miles adalah seorang pemuda yang dikerap dipanggil dengan nama Baby. Ia memiliki gejala tinitus di telinganya, maka dari itu Baby sering menggunakan earphone sembari mendengarkan musik lewat ipod yang dimilikinya.\n" +
                    "\n" +
                    "Baby sendiri bekerja sebagai seorang pengemudi mobil untuk kelompok kriminal dan perampok yang diorganisir oleh dalang penjahat berjuluk ‘Doc.’ Baby terpaksa melakukan hal itu untuk melunasi hutang kepada Doc karena telah mencuri salah satu mobil miliknya.\n" +
                    "\n" +
                    "Di sela-sela waktunya, Baby pun merawat ayah angkatnya, yang kebetulan seorang penderita tuna rungu bernama Joseph. Selain itu ia pun memiliki pacar bernama Debora, yang bekerja sebagai pelayan di sebuah restoran.\n" +
                    "\n" +
                    "Di suatu hari, perampokan yang dilakukan oleh kelompok Doc tidak berjalan lancar. Seorang pemburu bayaran mengejar Baby, dan mereka. Keadaan juga semakin rumit karena polisi juga ikut dalam aksi pengejaran tersebut.\n" +
                    "\n" +
                    "Walaupun begitu, Baby berhasil lolos dari kejaran semuanya. Sejak kejadian itu, Baby mulai melunasi hutangnya kepada Doc, lalu berhenti dari dunia kriminal dan perampokan.\n" +
                    "\n"
        ),
        DataFilm(
            R.drawable.spirited,
            "Spirited Away",
            "20 Juli 2001",
            "4.7",
            "Seorang gadis berusia 10 tahun Chihiro (Hiiragi Rumi) dan orang tuanya sedang diperjalanan menuju ke rumah baru mereka. Ayahnya yang memiliki kebiasaan mengambil jalan pintas malah membuat mereka tersesat dan tiba di depan sebuah terowongan yang misterius.\n" +
                    "\n" +
                    "Ayah dan ibunya turun dari mobil dan berjalan pergi menuju ke terowongan misterius tersebut. Chihiro yang tadinya tidak akan mengikuti orang tuanya yang pergi menuju terowongan itu akhirnya ikut pergi karena takut.\n" +
                    "\n" +
                    "Tapi ketika sampai di ujung terowongan, tampak sebuah desa yang tak berpenghuni namun ayahnya mencium aroma makanan di desa tersebut.\n" +
                    "\n" +
                    "Lalu mereka mengikuti arah aroma makanan itu. Dan sampailah mereka di sebuah kedai makanan tapi tidak terlihat pemilik kedai tersebut.\n" +
                    "\n" +
                    "Sementara ayah dan ibunya makan makanan yang tersedia di kedai itu, Chihiro pergi sendiri berkeliling di desa itu dan sampailah ia di sebuah pemandian air panas dan berjumpa dengan Haku (Irino Miyu) seorang anak laki-laki.\n" +
                    "\n" +
                    "Karena terkejut, Haku memperingati Chihiro untuk segera pergi meninggalkan tempat tersebut sebelum matahari terbenam.\n"
        ),
        DataFilm(
            R.drawable.despicablemesatu,
            "Despicable Me",
            "9 Juli 2020",
            "7.6/10",
            "Seorang penjahat super bernama Felonius Gru memiliki harga diri terluka ketika saingan tak dikenal mencuri Piramida Agung Giza. Dengan bantuan sahabat karib ilmuwannya, Dr. Nefario, dan Minionnya, Gru memutuskan untuk meningkatkan saingan misterius ini dengan menyusutkan dan mencuri Bulan. Mengetahui ini sangat mahal, Gru mencari pinjaman dari Bank of Evil. Tuan Perkins, presiden bank, terkesan dengan rencana tersebut, tetapi dia akan menyetujui pinjaman hanya jika Gru dapat memperoleh shrink ray yang diperlukan terlebih dahulu. Setelah mengetahui bahwa penjahat yang sedang naik daun yang dikenal sebagai Vector bertanggung jawab atas pencurian Piramida, Gru secara terbuka menunjukkan persaingan dengannya.\n" +
                    "\n" +
                    "Gru dan para Minion mencuri penyusutan sinar dari pangkalan pengujian rahasia di Asia Timur, tetapi Vektor mencegat mereka dan mencurinya untuk dirinya sendiri. Gru mencoba untuk menerobos benteng tak tertembus Vector untuk mengambil sinar penyusut, hanya untuk dikalahkan oleh banyak pertahanan. Karena sepertinya tidak ada yang berhasil, dia memperhatikan tiga gadis yatim piatu, Margo, Edith, dan Agnes, yang dapat dengan mudah memasuki markas karena mereka menjual kue. Gru menyamar dan mengadopsi gadis-gadis itu, berencana menggunakannya untuk menyusup ke markas Vector. Namun, Gru kesulitan mengasuh mereka dengan baik karena sifat keras kepala mereka, kelas balet mereka, dan ketidakmampuannya sendiri sebagai orang tua.\n" +
                    "\n" +
                    "Akhirnya, Gru dan para gadis tiba di benteng Vector, dan Gru berhasil mencuri kembali sinar penyusut. Gadis-gadis itu kemudian menyarankan hari di taman hiburan. Gru setuju, percaya dia bisa meninggalkan gadis-gadis di sana; tetapi karena dia tidak bisa, dia malah mulai terikat dengan mereka. Kemudian, Gru menghubungi Perkins melalui obrolan video, menyatakan bahwa ia akhirnya memiliki penyusutan sinar. Margo, Edith, dan Agnes menyela rapat tersebut, dan Perkins mengumumkan bahwa dia telah kehilangan kepercayaan pada Gru dan tidak akan lagi mendanai operasinya. Saat Gru memberi tahu Minion bahwa dia tidak bisa lagi mendanai perampokan, gadis-gadis itu menawarkan isi celengan mereka. Dengan Minion dan inspirasi dirinya sendiri, Gru menjual bagian dari sarangnya dan barang-barang yang dia curi selama bertahun-tahun untuk membuat pesawat ruang angkasa. Gru berencana untuk mencuri Bulan di tempat terdekat dari Bumi, tapi ini adalah hari yang sama dengan pertunjukan balet para gadis. Ketika Gru menjadi berkonflik, Dr. Nefario mengatur agar gadis-gadis itu dikembalikan ke panti asuhan, karena khawatir pertunjukan itu dapat merusak rencana. Pada saat yang sama, Perkins memberi tahu Vector tentang kepemilikan Gru atas shrink ray dan adopsi ketiga gadis itu, mendorong Vector untuk mengambil tindakan.\n" +
                    "\n" +
                    "Gru berhasil menyusutkan dan mencuri Bulan. Dia bergegas kembali ke Bumi untuk menghadiri pertunjukan, hanya untuk menemukan uang tebusan dari Vector, yang telah menyusup dan menculik gadis-gadis itu. Setelah tiba di markas Vector, Gru menyerahkan Bulan. Namun, Vector menunda kesepakatan itu dan setelah gagal menghentikan pergerakan Gru, terbang bersama gadis-gadis itu dan Bulan. Sementara itu, Dr. Nefario telah menemukan bahwa efek dari sinar penyusutan bersifat sementara: semakin besar benda tersebut, semakin cepat ia kembali ke ukuran aslinya. Gru, Dr. Nefario, dan Minion melakukan penyelamatan berani di udara kepada gadis-gadis itu, tepat sebelum Bulan menghancurkan pesawat ruang angkasa Vector dan meluncurkan dirinya kembali ke orbit, bersama dengan Vector di atasnya.\n" +
                    "\n" +
                    "Beberapa waktu kemudian, Gru mengadopsi kembali gadis-gadis itu, menulis buku cerita pengantar tidur untuk mereka berdasarkan pengalamannya sendiri. Para gadis melakukan resital balet mereka untuk Gru, ibunya, Marlena, Dr. Nefario, dan Minion, hanya untuk salah satu Minion untuk mengalihkan musik ke sesuatu yang lebih modern, mengakhiri film dengan pesta dansa.\n" +
                    "\n" +
                    "Selama kredit akhir, tiga Minion mencoba melewati celah di atas putih. Dalam upaya terakhir mereka, sang pelatih akhirnya terbang, menghancurkan layar film"
        ),
        DataFilm(
            R.drawable.despicablemedua,
            "Despicable Me 2",
            "3 Juli 2023",
            "7.3/10",
            "jatuh cinta pada Gru, melompat keluar dari pesawat dan menggunakan pesawat layang untuk mencapai pesta. Gru menemukan bahwa El Macho, yang telah mempekerjakan Nefario sebagai teman kerja, telah menculik Minion Gru dan menggunakan serum PX-41 curian untuk menjadikannya fanatik dan tidak dapat dihancurkan. El Macho berencana untuk meluncurkan roket yang penuh dengan Minion yang bermutasi ke kota-kota besar untuk mendominasi dunia. Dia menawarkan Gru kesempatan untuk bekerja sama dengannya, tetapi Gru berjalan pergi dan El Macho mengirim salah satu Mnion mengejarnya.\n" +
                    "\n" +
                    "Gru membawa gadis-gadis itu pulang dan menemukan Margo yang patah hati ketika Antonio telah memilih gadis lain untuk berdansa dengan selain dia; Gru membekukannya di jalan keluar. Lucy kemudian tiba di pesta tepat setelah Gru pergi, tetapi El Macho menangkap Lucy setelah Pollito, ayam peliharaan El Macho, mengambil lencana ID AVL-nya dari dompetnya. Nefario bergabung kembali dengan Gru dan mengatakan kepadanya bahwa Lucy telah ditangkap, Gru kembali ke bentengnya dengan dua Minionnya. Sementara itu, di rumah Gru, Minion yang dilepaskan El Macho menemukan rumahnya dan menyerang gadis-gadis itu, tetapi Nefario datang untuk menyelamatkan mereka karena ia telah menciptakan penangkal serum dan menempatkannya di dalam jeli. Gru memasuki benteng dengan dua MInion tersamar yang ditutupi dengan cat ungu berpura-pura ditangkap untuk membantunya memasuki benteng El Macho, tetapi salah satu Minion mengelap cat dari wajahnya dengan sarung tangannya mengungkapkan kepada semua Minion ungu bahwa ia bukan satu dari mereka dan penculikan itu palsu, oleh karena itu para Minion ungu menyerang dan memojokkan mereka, Untung Nefario, para gadis dan para Minion Gru yang dalam keadaan normal tiba dengan penawarnya dan mengembalikan semua pelayan ke keadaan normal. El Macho kemudian meminum mutagen pada dirinya sendiri dan berubah menjadi monster, tetapi Gru dan Nefario mengalahkannya menggunakan taser lipstik Lucy dan pistol asap buang angin masing-masing.\n" +
                    "\n" +
                    "Gru menemukan Lucy diikat ke roket hiu bermuatan TNT dan mulai melepaskannya, tetapi Pollito meluncurkan roket, mengirimnya terbang menuju gunung berapi yang sama di mana El Macho sebelumnya memalsukan kematiannya. Lucy menerima undangan Gru untuk kencan, dan pasangan itu menyelam ke lautan beberapa detik sebelum roket memasuki gunung berapi dan meledak dengan hebat. Gru bergabung kembali dengan AVL, dan dia dan Lucy akhirnya menikah, memberi Margo, Edith, dan Agnes seorang ibu."
        ),
        DataFilm(
            R.drawable.babyboss,
            "The Baby Boss",
            "5 April 2017",
            "6.3/10",
            "Tim, bocah 7 tahun, iri saat orangtuanya lebih perhatian pada adiknya. Ia segera sadar ternyata adik bayinya bisa berbicara. Keduanya pun bekerjasama untuk menggagalkan rencana jahat CEO PuppyCo."
        )
    )

    val filmList: MutableLiveData<List<DataFilm>> = MutableLiveData(list)

    fun getFilmList() {
        val film = list
        filmList.value = film
    }
}