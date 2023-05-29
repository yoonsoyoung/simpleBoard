import { createRouter, createWebHistory } from 'vue-router';
import Main from '../views/Main.vue';

// 게시판 메뉴
import Board from '../views/Board.vue';
import BoardListView from '@/components/Board/BoardListView.vue';

// 에러 페이지
import Error404 from '../views/404.vue';

const routes = [
  {
    path: '/',
    name: 'Main',
    component: Main,
  },
  {
    path: '/board',
    name: 'Board',
    component: Board,
    children: [
      {
        path: 'all',
        name: 'BoardListView',
        component: BoardListView,
      },
    ],
  },
  {
    path: '/404',
    name: 'Error404',
    component: Error404,
  },
  {
    path: '/:catchAll(.*)',
    redirect: '/404',
  },
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
});

export default router;
