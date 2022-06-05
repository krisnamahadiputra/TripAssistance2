package com.kuliah.tripassistance;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.SearchView;

import com.kuliah.tripassistance.adapter.ListReligiAdapter;
import com.kuliah.tripassistance.model.ModelReligi;

import java.util.ArrayList;

public class ReligiActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<ModelReligi> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religi);

        getData();

        recyclerView = findViewById(R.id.rvReligi);
        ListReligiAdapter listReligi= new ListReligiAdapter(data);
        recyclerView.setAdapter(listReligi);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(ReligiActivity.this, 2);
        recyclerView.setLayoutManager(layoutManager);

        listReligi.setOnItemClickCallBack(new ListReligiAdapter.OnClickItemCallBack() {
            @Override
            public void onItemClicked(ModelReligi data) {
                Intent intent = new Intent(ReligiActivity.this, DetailReligiActivity.class);
                intent.putExtra("namaTempatReligi", data.getNamatempatreligi());
                intent.putExtra("descTempatReligi", data.getDesctempatreligi());
                intent.putExtra("fotoReligi", data.getGambartempatreligi());
                startActivity(intent);
            }
        });
    }

    public void getData(){
        data.add(new ModelReligi("Hindu",R.drawable.tanahlot, "Pura Tanah Lot", "Objek wisata Tanah Lot terletak di Desa Beraban, Kecamatan Kediri, Kabupaten Tabanan, sekitar 13 kilometer di sebelah selatan Kota Tabanan. Pura Tanah Lot adalah salah satu Pura yang sangat disucikan di Bali, Indonesia. Pura Tanah Lot ini merupakan bagian dari pura Dang Kahyangan. Pura Tanah Lot merupakan pura laut tempat pemujaan dewa-dewa penjaga laut. Tanah Lot terkenal sebagai tempat yang indah untuk melihat matahari terbenam. Jam buka Pura Tanah Lot untuk wisatawan dari pukul 06:00 – 19:00. Andai tujuan anda bersembahyang, maka Pura Tanah Lot buka 24 jam. Tiket masuk wisatawan domestik yaitu Rp 20.000/orang untuk dewasa dan Rp 15.000/orang untuk anak (5-10 tahun)."));
        data.add(new ModelReligi("Hindu",R.drawable.uluwatu, "Pura Luhur Uluwatu", "Pura Luhur Uluwatu atau Pura Uluwatu merupakan pura yang berada di wilayah Desa Adat Pecatu, Kecamatan Kuta Selatan, Kabupaten Badung. Pura yang terletak di ujung barat daya pulau Bali di atas anjungan batu karang yang terjal dan tinggi serta menjorok ke laut ini merupakan Pura Sad Kayangan yang dipercaya oleh orang Hindu sebagai penyangga dari 9 mata angin. Pura Uluwatu terletak pada ketinggian 97meter dari permukaan laut. Jam buka Pura Uluwatu untuk wisatawan dari pukul 07:00 – 22:00. Andai tujuan anda bersembahyang, maka Puru Uluwatu buka 24 jam. Tiket masuk wisatawan domestik yaitu Rp 30.000/orang untuk dewasa dan Rp 20.000/orang untuk anak (6-12 tahun)."));
        data.add(new ModelReligi("Hindu",R.drawable.ulundanu, "Pura Ulun Danu Beratan", "Pura Ulun Danu Beratan merupakan sebuah pura dan candi air besar di Bali, Indonesia. Kompleks candi ini terletak di tepi barat laut Danau Bratan di pegunungan dekat Bedugul, Kabupaten Tabanan. Jam buka tempat wisata Pura Ulun Danu Beratan untuk kunjungan wisatawan dari pukul 07:00 – 19:00. Sedangkan waktu terbaik berkunjung ke Pura Ulun Danu sekitar pukul 08:00. Kunjungan di pagi hari dengan tujuan memudahkan anda untuk foto, dan kabut belum turun menutupi area danau dan pura. Tiket masuk wisatawan domestik yaitu Rp 30.000/orang untuk dewasa dan Rp 10.000/orang untuk anak-anak."));
        data.add(new ModelReligi("Hindu",R.drawable.tirtaempul, "Pura Tirta Empul", "Pura Tirta Empul adalah pura Hindu di tengah pulau Bali, Indonesia, tepatnya di Desa Manukaya, Kecamatan Tampaksiring, Kabupaten Gianyar, yang terkenal dengan air sucinya di mana orang Hindu Bali mencari penyucian. Bagi masyarakat Bali pemeluk agama Hindu, air dari pancuran di pura Tirta Empul adalah air suci yang diyakini akan membawa kesucian, ketenangan serta keberuntungan. Sumber mata air alami dan pemandian di area pura, menjadi daya tarik pura Tirta Empul sebagai tempat liburan di Bali. Jam buka Tirta Empul temple untuk kunjungan wisatawan dari pukul 08:00 – 18:00. Tiket masuk wisatawan domestik yaitu Rp 30.000/orang untuk dewasa dan Rp 25.000/orang untuk anak-anak."));
        data.add(new ModelReligi("Hindu",R.drawable.tamanayun, "Pura Taman Ayun", "Pura Taman Ayun Mengwi terletak di jalan Ayodya No 10 Mengwi, Kabupaten Badung. Jika di terjemahkan ke bahasa Indonesia, Taman Ayun artinya taman yang indah. Pada area luar pura Taman Ayun terdapat halaman yang sangat luas dengan desain tembok pagar khas Bali. Sedangkan di dalam area pura Taman Ayun dalam terdapat kolam air yang mengelilingi areal pura. Pura Taman Ayun salah satu contoh dari keunikan serta keindahan arsitektur tradisional Bali dengan kombinasi pengaruh arsitektur Tiongkok. Jam buka Taman Ayun temple untuk kunjungan wisatawan dari pukul 08:00 – 18:15. Sedangkan waktu terbaik berkunjung sekitar pukul 16:00. Tiket masuk wisatawan domestik yaitu Rp 15.000/orang."));
        data.add(new ModelReligi("Hindu",R.drawable.tamansaraswati, "Pura Taman Saraswati", "Salah satu objek wisata pura yang ada di Ubud Bali favorit wisatawan adalah Pura Taman Saraswati. Lokasi pura Taman Saraswati berada di area pusat Ubud di Jalan Kajeng sebelah utara jalan raya Ubud. dengan daya tarik utama terdapat pada keindahan arsitektur dan kolam bunga teratai. Sebagian besar wisatawan yang mengunjungi pura Taman Saraswati akan melakukan sesi foto dengan latar belakang pura. Selain itu, tidak ada biaya tiket masuk ke pura Taman Saraswati Ubud. Setiap pukul 19:30, di area pura Taman Saraswati Ubud akan di pentaskan pertunjukan seni tari Bali."));
        data.add(new ModelReligi("Hindu",R.drawable.gununglebah, "Pura Gunung Lebah", "Salah satu objek wisata pura yang ada di Ubud menarik untuk dikunjungi adalah Pura Gunung Lebah. Lokasi dari pura Gunung Lebah berada di bawah jembatan sungai Campuhan Ubud di Jalan Raya Ubud, Sayan, Kabupaten Gianyar, Bali. Melihat dari lokasinya yang berada di bawah Jembatan sungai Campuhan Ubud, termasuk lokasi pura yang berbeda dari biasanya. Tahukah anda, pura ini termasuk dalam kategori pura Kahyangan Jagat? Artinya semua umat Hindu dapat bersembahyang di pura Gunung Lebah. Tidak ada biaya masuk untuk memasuki pura ini, artinya gratis tiket masuk."));
        data.add(new ModelReligi("Hindu",R.drawable.goalawah, "Pura Goa Lawah", "Pura Goa Lawah merupakan sebuah pura yang terletak di Desa Pasinggahan, Kecamatan Dawan, Kabupaten Klungkung, Bali, yang berjarak sekitar 40 km dari ibu kota Bali, Denpasar. Goa Lawah adalah salah satu pura penting bagi umat Hindu di Bali. Keunikan dari pura Goa Lawah karena lokasi pura di bangun di depan area goa yang di huni ribuan kelelawar. Walaupun ada banyak kelelawar, anda tidak perlu khawatir mengunjungi pura Goa Lawah, karena sangat aman. Tiket masuk wisatawan domestik yaitu Rp 15.000/orang."));
        data.add(new ModelReligi("Hindu",R.drawable.gunungkawi, "Pura Gunung Kawi", "Candi Gunung Kawi atau Candi Tebing Kawi adalah situs purbakala yang dilindungi di Bali. Terletak di Sungai Pakerisan, Dusun Penaka, Desa Tampaksiring, Kecamatan Tampaksiring, Kabupaten Gianyar, Provinsi Bali, Indonesia. Candi ini sangat unik karena biasanya candi berupa batuan utuh yang terbuat dari bata merah atau batu gunung, namun candi ini tidak seperti itu melainkan pahatan di dinding tebing batu padas ditepi sungai. Nama Gunung Kawi itu sendiri konon berasal dari kata Gunung dan Kawi. Gunung berarti Gunung atau Pegunungan dan Kawi Berarti Pahatan Jadi Candi Gunung Kawi berarti Candi yang dipahat di atas gunung. Tiket masuk wisatawan domestik yaitu Rp 30.000/orang."));
        data.add(new ModelReligi("Hindu",R.drawable.besakih, "Pura Besakih", "Pura Besakih adalah sebuah komplek pura yang terletak di Desa Besakih, Kecamatan Rendang, Kabupaten Karangasem, Bali, Indonesia. Lokasi pura Besakih berada 1000meter dari lereng gunung Agung. Pura Besakih adalah komplek pura besar yang jumlahnya sangat banyak. Saking besarnya area pura Besakih, untuk menjelajahi semua area pura akan memerlukan waktu lebih dari satu hari. Waktu buka Pura Besakih untuk kunjungan wisatawan dari pukul 08:00 – 18:00. Sedangkan waktu terbaik berkunjung sekitar pukul 08:00 pagi, untuk menghindari kabut turun menutupi pemandangan Gunung Agung. Tiket masuk wisatawan domestik yaitu Rp 30.000/orang."));
    }

}