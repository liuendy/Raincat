/*
 *
 * Copyright 2017-2018 549477611@qq.com(xiaoyu)
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, see <http://www.gnu.org/licenses/>.
 *
 */

package com.raincat.core.compensation;

import com.raincat.common.bean.TransactionRecover;
import com.raincat.common.config.TxConfig;

/**
 * this save transaction log.
 * @author xiaoyu
 */
public interface TxCompensationService {

    /**
     * this is start.
     *
     * @param txConfig {@linkplain TxConfig }
     * @throws Exception ex
     */
    void start(TxConfig txConfig) throws Exception;

    /**
     * save transaction recover.
     *
     * @param transactionRecover {@linkplain TransactionRecover }
     * @return pk
     */
    String save(TransactionRecover transactionRecover);


    /**
     * remove transaction recover.
     *
     * @param id pk
     * @return true success
     */
    boolean remove(String id);


    /**
     * update transactionRecover.
     * @param transactionRecover  {@linkplain TransactionRecover }
     */
    void update(TransactionRecover transactionRecover);


    /**
     * 执行补偿.
     * @param transactionRecover {@linkplain TransactionRecover}
     */
    void compensation(TransactionRecover transactionRecover);

}
