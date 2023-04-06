package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class JpaMemberRepository implements MemberRepository {

<<<<<<< HEAD
//    private final EntityManager em;

    @Override
    public Member save(Member member) {
        return null;
=======
    private final EntityManager em;

    public JpaMemberRepository(EntityManager em) {
        this.em = em;
    }

    @Override
    public Member save(Member member) {
        em.persist(member);
        return member;
>>>>>>> 6336f3dcdc1dfe1c1f59087eb8dfaf473dc9e08d
    }

    @Override
    public Optional<Member> findById(Long id) {
<<<<<<< HEAD
        return Optional.empty();
=======
        Member foundMember = em.find(Member.class, id);
        return Optional.ofNullable(foundMember);
>>>>>>> 6336f3dcdc1dfe1c1f59087eb8dfaf473dc9e08d
    }

    @Override
    public Optional<Member> findByName(String name) {
<<<<<<< HEAD
        return Optional.empty();
=======
        List<Member> result = em.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();

        return result.stream().findAny();
>>>>>>> 6336f3dcdc1dfe1c1f59087eb8dfaf473dc9e08d
    }

    @Override
    public List<Member> findAll() {
<<<<<<< HEAD
        return null;
=======
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
>>>>>>> 6336f3dcdc1dfe1c1f59087eb8dfaf473dc9e08d
    }
}
