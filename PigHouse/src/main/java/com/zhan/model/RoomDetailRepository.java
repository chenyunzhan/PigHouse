package com.zhan.model;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface RoomDetailRepository  extends CrudRepository<RoomDetail, Long> {

	
	 @Query(value="select a.id house_id, b.id room_id, a.address, a.room, a.phone, a.latitude, a.longitude, b.price, b.room_no, b.attribute0, b.desk, b.bed, b.chair, b.toilet, ROUND(6378.138 * 2 * ASIN( SQRT( POW( SIN((?2 * PI() / 180 - latitude * PI() / 180) / 2),2) + COS(?2 * PI() / 180) * COS(latitude * PI() / 180) * POW(SIN((?3 * PI() / 180 - longitude * PI() / 180) / 2),2))) * 1000) AS distance from house a left join room b on (a.room1=b.id or a.room2=b.id or a.room3=b.id or a.room4=b.id or a.room5=b.id or a.room6=b.id or a.room7=b.id or a.room8=b.id  or a.room9=b.id) where b.attribute1 = 0 and b.id != ?1",nativeQuery=true) 
	 public Iterable<RoomDetail> getRoomDetails(String houseId, String latitude, String longitude); 
	
}
