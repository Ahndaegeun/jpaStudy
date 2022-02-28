package datajpa.datajpa.repository;

import datajpa.datajpa.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberQueryRepository {

    private final EntityManager em;

    public List<Member> findAllMember() {
        return em.createQuery("select m from Member m", Member.class)
                .getResultList();
    }
}
