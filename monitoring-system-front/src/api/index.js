import axios from 'axios';

function createInstance(url) {
  const instance = axios.create({
    baseURL: `${process.env.VUE_APP_API_URL}${url}`,
    headers: {
      'Content-Type': 'application/json',
    },
  });
  return instance;
}

function createInstanceForControl(url) {
  const instance = axios.create({
    baseURL: `${process.env.VUE_APP_CONTROL_URL}${url}`,
    headers: {
      'Content-Type': 'application/json',
    },
  });
  return instance;
}

export const data = createInstance('/data');
export const control = createInstanceForControl('/');
