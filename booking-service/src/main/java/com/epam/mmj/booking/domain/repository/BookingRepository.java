package com.epam.mmj.booking.domain.repository;

import java.util.Collection;

/**
 * @param <Booking>
 * @param <String>
 * @author Sourabh Sharma
 */
public interface BookingRepository<Booking, String> extends Repository<Booking, String> {

  /**
   * @param name
   */
  boolean containsName(String name);

  /**
   * @param name
   */
  public Collection<Booking> findByName(String name) throws Exception;

  /**
   *
   * @param id
   * @return
   * @throws Exception
   */
  public Collection<Booking> findByUserId(String id) throws Exception;
}
