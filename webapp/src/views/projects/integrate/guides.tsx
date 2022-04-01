import { default as React } from 'react';
import { Guide } from 'tg.views/projects/integrate/types';
import { Code, Settings } from '@material-ui/icons';

const getTechnologyImgComponent = (imgName: string) => {
  return function TechnologyImage(props) {
    return (
      <img
        src={`/images/technologies/${imgName}.svg`}
        alt={imgName}
        {...props}
      />
    );
  };
};

export const guides = [
  {
    name: 'React (CRA)',
    icon: getTechnologyImgComponent('react'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/React.mdx')
    ),
  },
  {
    name: 'Angular',
    icon: getTechnologyImgComponent('angular'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Angular.mdx')
    ),
  },
  {
    name: 'Vue',
    icon: getTechnologyImgComponent('vue'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Vue.mdx')
    ),
  },
  {
    name: 'Next.js',
    icon: getTechnologyImgComponent('next'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Next.mdx')
    ),
  },
  {
    name: 'Gatsby',
    icon: getTechnologyImgComponent('gatsby'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Gatsby.mdx')
    ),
  },
  {
    name: 'Php',
    icon: getTechnologyImgComponent('php'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Php.mdx')
    ),
  },
  {
    name: 'Web',
    icon: Code,
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Web.mdx')
    ),
  },
  {
    name: 'JS (NPM)',
    icon: getTechnologyImgComponent('js'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Js.mdx')
    ),
  },
  {
    name: 'Rest',
    icon: Settings,
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Rest.mdx')
    ),
  },
  {
    name: 'Svelte',
    icon: getTechnologyImgComponent('svelte'),
    guide: React.lazy(
      // @ts-ignore
      () => import('!babel-loader!@mdx-js/loader!./guides/Svelte.mdx')
    ),
  },
] as Guide[];
