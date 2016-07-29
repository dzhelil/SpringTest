package data;

import java.util.List;

import beans.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);

}
