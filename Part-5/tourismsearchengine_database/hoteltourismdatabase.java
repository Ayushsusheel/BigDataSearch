package tourismsearchengine.database;

public class HoteltourismDatabase 
{
private static final Hotel[] HOTELS =
				{
					new Hotel( "100", "Raheem Residency", "20/1100Beach Road, Alleppey West - 688 012, KERALA","Heritage Classic"),
			    	new Hotel( "101", "Noor Us Sabah Palace", "V.I.P.RoadKoh-E-Fiza, Bhopal - 462001, MADHYA PRADESH","Heritage Classic"),
			    	new Hotel( "102", "The Panjim Inn ", "31-ST JANUARY ROAD, FONTAINHAS, PANAJI, Panaji , GOA","Heritage Basic"),
			    	new Hotel( "103", "Balaram Palace Resort", "Chitrassani Village,off Abu Palanpur Highway No.14 Banaskantha, BANASKANTHA, GUJARAT","Heritage Basic"),
			    	new Hotel("104", "Nilambag Palace Hotel", "Bhavnagar, Bhavnagar, GUJARAT","Heritage Basic"),
			    	new Hotel( "105", "The Fort Ramgarh", "Ramgarh, Panchkula On NH - 73 Delhi Shimla Highway, Near Chandigarh, Panchkula Distt., HARYANA","Heritage Basic"),
			        new Hotel("106", "The Judges Court", "Heritage VillageParagpur, Distt. - Kangra - 177107, HIMACHAL PRADESH","Heritage Basic"),
			    	new Hotel( "107", "The Palace", "Chail, Solan,HIMACHAL PRADESH","Heritage Basic"),
			    	new Hotel( "108", "The Castle Naggar", "Naggar, Distt. Kullu - 175130, HIMACHAL PRADESH","Heritage Basic"),
			    	new Hotel("109", "Hotel Cherthala House", "Court JunctionEast of P.M.C. - 5, cherthala - 688 524, KERALA","Heritage Basic"),
			    	new Hotel("110", "Heritaga Methanam", "K P XI / 298Near Perumpadappu, Kumbalanghi Bridge, Kumbalanghi P.O., Kochi - 682 007, KERALA","Heritage Basic"),
			    	new Hotel("111", "Old Lighthouse Bristow Hotel ", "Beach Road Next to SBI Training Center Fort Kochi , Cochin , KERALA","Heritage Basic"),
			    	new Hotel( "112", "Hotel Le Colonial ", "1/215, Church Road, Vasco-da-Gama Square, Fort Cochin , KERALA","Heritage Basic"),
			    	new Hotel("113", "Kunnathur Mana Ayurveda Heritage", "Door No.VIII/666 Punnayurkulam P.O. Thrissur Dist, Kerala, KERALA","Heritage Basic"),
			    	new Hotel("114", "Old Harbour Hotel", "No-1/328, Tower Road, Fort Kochi , Kochi , KERALA","Heritage Basic"),
			    	new Hotel("115", "Coconut Lagoon", "P.O. Box No. 2Kumarakom, Kottayam - 686563, KERALA","Heritage Basic"),
			    	new Hotel("116", "Beach Hotel", "(Beach Heritage Inn (P) Ltd.)Beach Road, Kozhikode - 673032, KERALA","Heritage Basic"),
			    	new Hotel("117", "Palakkad Heritage Hotels", "Koduvayur P.O.Palakkad, Dist., KERALA ","Heritage Basic"),
			    	new Hotel("118", "Somatheeram Ayurvedic Beach Resort (P) Ltd.", "P.O. ChowaraVia Balaramapuram, Thiruvananthapuram - 695501, KERALA","Heritage Basic"),
			    	new Hotel("119", "The Hillway Heritage", "Opp. Police Station, State Highway - 1Kilimanoor P.O., Thiruvananthapuram - 695601, KERALA","Heritage Basic"),
			        new Hotel("120", "Ahilya Fort ", "Ahilya Fort, Maheshwar, W Nimar , Bhopal , MADHYA PRADESH","Heritage Basic"),
			        new Hotel("121", "Hotel Rock End Manor ", "Pachmarhi Distt. ,HOSHANGABAD , MADHYA PRADESH","Heritage Basic"),
			        new Hotel("122", "Satpura Retreat", "Pachmarhi, Dist. Hosangabad, MADHYA PRADESH","Heritage Basic"),
			        new Hotel("123", "Hotel Sheesh Mahal ", "MPSTDC, Orchha, Tikamgarh Dist. , MADHYA PRADESH","Heritage Basic"),
			        new Hotel(  "124", "Jehan Numa Palace Hotel ", "157, SHAMLA HILL(M.P) , Bhopal , MADHYA PRADESH","Heritage Basic"),
			        new Hotel( "125", "LE DUPLEIX ", "(unit of auberge Heritage Hotels) 5, CASERNE STREET , Pondicherry, PONDICHERRY","Heritage Basic"),
			        new Hotel( "126", "Calve", "A Heritage HotelOld No. 36, New No. 44, Vysial Street, Puducherry - 605 001, PUDUCHERRY","Heritage Basic"),
			        new Hotel( "127", "Welcome Heritage, Khimsar Fort", "Khimsar, RAJASTHAN ","Heritage Basic"),
			        new Hotel( "128", "The Bagh ", "Agra Achnara Road Pucca Bagh Bharatpur, Bharatpur, RAJASTHAN ","Heritage Basic"),
			        new Hotel( "129", "Gajner Palace", "P.O. GajnerTehsil : Kolayat, Bikaner - 334001, RAJASTHAN","Heritage Basic"),
			        new Hotel( "130", "The Laxmi Niwas Palace ", "A Unit of Golden Triangle Fort and Palace Pvt. Ltd. Dr. Karni Singhji Road ,Bikaner ,RAJASTHAN","Heritage Basic"),
			        new Hotel( "131", "Chomu Palace", "Near Main ChomuBus Stand, Chomu - 303702, RAJASTHAN","Heritage Basic"),
			        new Hotel( "132", "Bissau Palace ", "Outside Chandpole Gate , Jaipur, RAJASTHAN","Heritage Basic"),
			        new Hotel( "133", "Deogarh Resorts", "Deogarh MahalP.O. Deogarh Madariya, Distt. Rajsamand - 313331, RAJASTHAN","Heritage Basic"),
			        new Hotel(  "134", "Shikarbadi Hotel", "Goverdhan Vilas, Udaipur - 313001, RAJASTHAN","Heritage Basic"),
			        new Hotel("135", "Welcom Heritage - Koolwal Kothi", "House No. 40,Near Government Hospital RoadNawal Garh District, Jhunjhunu, RAJASTHAN","Heritage Basic"),
			        new Hotel("136", "Ajit Bhawan", "Near Circuit House, Jodhpur - 342 006, RAJASTHAN","Heritage Basic"),
			      new Hotel("137", "Hotel Samode Palace", "Village Samode, Dist. Jaipur - 303806, RAJASTHAN","Heritage Basic"),
			      new Hotel("138", "Raj Niwas Palace", "National Highway-3, Dholpur - 328 001, RAJASTHAN","Heritage Basic"),
			      new Hotel("139", "Hotel Castle Mandawa Pvt.Ltd.", "MandawaJhunjhunu District, Shekhawati - 333704, RAJASTHAN","Heritage Basic"),
			      new Hotel("140", "Rohet Garh", "Village P.O RohetDistt. Pali, Rajasthan, RAJASTHAN","Heritage Basic"),
			      new Hotel("141", "Lake Pichola Hotel", "Piplia Haveli, Out Side ChandpoleUdaipur, Rajasthan, Udaipur, RAJASTHAN","Heritage Basic"),
			      new Hotel("142", "The Ramgarh Lodge", "Ramgarh LakeJamwa Ramgarh, Jaipur - 303109, RAJASTHAN","Heritage Basic"),
			      new Hotel("143", "Hotel Indra Villas ", "A unit of Desert Heritage Resorts Pvt. Ltd. Ward No.2, Village Alsisar , JHUNJHUNU , RAJASTHAN","Heritage Basic"),
			      new Hotel("144", "Singhasan Haveli", "Goenka Chowk, Mandawa,Dist., JHUNJHUNU, RAJASTHAN","Heritage Basic"),
			      new Hotel("145", "Fort Khejarla", "(Aunit of Bhandari Heritage Pvt. Ltd.)Village Khejarla, Via Bilara, Distt. Jodhpur - 342601, RAJASTHAN","Heritage Basic"),
			      new Hotel("146", "Sardargarh Heritage Hotel ", "Sardargarh Fort, Village-Lawa Sardargarh Sardargarh, Dist:-Rajsamand , Rajsamand , RAJASTHAN","Heritage Basic"),
			      new Hotel("147", "The Sawai Madhopur Lodge", "Ranthambore National Park Road, Sawai Madhopur - 302 005, RAJASTHAN","Heritage Basic"),
			      new Hotel("148", "Karni Bhawan Palace ", "Gandhi Colony Bikaner ,Bikaner ,RAJASTHAN","Heritage Basic"),
			      new Hotel("149", "Norkhill Hotel ", "Stadium Road, Gangtok , SIKKIM","Heritage Basic"),
			      new Hotel("150", "Visalam", "7/1/143 LOCAL FUND ROAD, KANADUKATHAN KARAIKUDI, TAMIL NADU, KARAIKUDI, TAMIL NADU","Heritage Basic"),
			      new Hotel("151", "Hotel Fairhavens Holiday Home", "Adacent to Head Post Office Mallital, Nainital, UTTARAKHAND","Heritage Basic"),
		          new Hotel("170", "Bell Tower Resorts Pvt.Ltd. ", "Bell Tower Resorts Pvt.Ltd. (Retreat by Zuri) Pedda, Uttor Doxi, Varca Salcatte-Goa-403721 , Salcete , GOA","5 Star Deluxe"),
			      new Hotel( "171", "Hotel Ramada Caravela Beach Resort", "Varca Beach, Salcete - 403721, GOA","5 Star Deluxe"),
			      new Hotel( "172", "Vivanta By Taj- Fort Aguada", "Sinquerim, Bardez - 403519, GOA ","5 Star Deluxe"),
			      new Hotel("173", "Th Lalit Golf & Spa Resort Goa", "(Bharat Hotels Ltd.)Raj Baga,Canacona, GOA","5 Star Deluxe"),
			      new Hotel( "174", "Resort Rio", "Resort Rio, Tambudki,Arpora, Bardez, GOA","5 Star Deluxe"),
			      new Hotel( "175", "Hotel Cidade de Goa", "(Unit of Fomento Resorts & Hotels Ltd.), Vainguinim Beach - 403004, GOA","5 Star Deluxe"),
			      new Hotel( "176", "Majorda Beach Resort", "MajordaSalcette, Goa - 403713, GOA","5 Star Deluxe"),
			      new Hotel("260", "The Galaxy Hotel", "NH-8Sector-15, Part-II, Gurgaon - 122001, HARYANA","5 Star"),
			      new Hotel("261", "THE CHANCERY PAVILION", "ELIXIR ENTERPRISES & HOTELS PVT LTD., NO-135, RESIDENCY ROAD, BANGALORE, KARNATAKA","5 Star"),
			      new Hotel("262", "The Zuri - Whitefield", "Rajpalya Hoodi - RoadWhitefield, Bengaluru - 560048, KARNATAKA","5 Star"),
			      new Hotel( "347", "Hotel Hills Park", "Kumbazha Road,Pathanamthitta,District, Kerala, KERALA","4 Star"),
			      new Hotel( "348", "Neelamabari Suite", "Villanchira,Thalakkodu P.O.Neriyamangalam, Ernakulam, KERALA","4 Star"),
			      new Hotel( "349", "Excalibur Hotels & Resorts", "Carithas Junction,MC Road,Thellakon, Kottayam, KERALA","4 Star")
			

		};
	

		    
		    public static Hotel[] getHotels() {
		        return HOTELS;
		    }
		    
		    public static Hotel getHotel(String id) {
		        for(Hotel hotel : HOTELS) {
		            if (id.equals(hotel.getId())) {
		                return hotel;
		            }
		        }
		        return null;
		    }
		

	}


