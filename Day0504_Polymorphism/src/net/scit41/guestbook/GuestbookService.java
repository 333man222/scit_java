package net.scit41.guestbook;
// C R U D ,여러개 글 조회, 전체 글 조회
public interface GuestbookService {
	public int write (GuestbookVO vo);
	public int delete (int guestbookNo);
	public int update (GuestbookVO vo);
	public GuestbookVO retrieve(int guestbookNo);
}
